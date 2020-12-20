package com.example.bodimanew;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class  DbHandler extends SQLiteOpenHelper {

    private  static final int VERSION=1;
    private static final String DB_NAME="todo";
    private  static final String TABLE_NAME="todo";

    //COLUMN NAMES
    private static  final String id="id";
    private static final String title="title";
    private static final String description="description";
    private static final String started="started";
    private static final String finished="finished";

    public DbHandler(@Nullable Context context) {
        super(context,DB_NAME, null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         String TABLE_CREATE_QUERY="CREATE TABLE "
                 +TABLE_NAME+" "+
                "("
                 +id+"INTEGER PRIMARY KEY AUTOINCREMENT,"
                 +title+"TEXT,"
                 +description+"TEXT,"
                 +started+"TEXT,"+
                 finished+"TEXT);";
         db.execSQL(TABLE_CREATE_QUERY);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    String DROP_TABLE_QUERY="DROP TABLE IF EXISTS "
            +TABLE_NAME;
    //DROP OLDER TABLE IF EXISTED
        db.execSQL(DROP_TABLE_QUERY);
        //create tables again
        onCreate(db);
    }
}
