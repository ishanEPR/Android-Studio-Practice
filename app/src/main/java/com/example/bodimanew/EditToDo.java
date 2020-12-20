package com.example.bodimanew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditToDo extends AppCompatActivity {
private EditText title,desc;
private Button edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_to_do);
        title=findViewById(R.id.editTextToDoTextTitle);
        desc=findViewById(R.id.editTextToDoTextdescriptiption);
        edit=findViewById(R.id.buttonEdit);
    }
}