package com.example.passingactivitydata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView ageText, nameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ageText = findViewById(R.id.textAge);
        nameText = findViewById(R.id.textName);

        Bundle bundle = getIntent().getExtras();

       String name = bundle.getString("Name");
       int age = bundle.getInt("Age");
       Users  users = (Users) bundle.getSerializable("object");

       nameText.setText(users.getEmail());
       ageText.setText(String.valueOf(age));

    }
}