package com.example.bodimanew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddToDo extends AppCompatActivity {
private EditText title,desc;
private Button add;
private DbHandler dbHandler;
private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);
        title=findViewById(R.id.editTextTitle);
        desc=findViewById(R.id.editTextdescription);
        add=findViewById(R.id.btnaddtodo);

        context=this;
        dbHandler=new DbHandler(context);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usertitle=title.getText().toString();
                String userdesc=desc.getText().toString();

                long started=System.currentTimeMillis();
                ToDo toDo=new ToDo(usertitle,userdesc,started,0);
                dbHandler.addToDo(toDo);
            }
        });
    }
}