package com.example.passingactivitydata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Users users = new Users("Ahmad", "ahmad@gmail.com");

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("Name", "Ahmad");
                intent.putExtra("Age", 23);
                intent.putExtra("object", users);
                startActivity(intent);
            }
        });
    }
}