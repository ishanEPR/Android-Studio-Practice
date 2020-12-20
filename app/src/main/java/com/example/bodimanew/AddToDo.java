package com.example.bodimanew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddToDo extends AppCompatActivity {
private EditText title,desc;
private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);
        title=findViewById(R.id.editTextTitle);
        desc=findViewById(R.id.editTextdescription);
        add=findViewById(R.id.btnaddtodo);
    }
}