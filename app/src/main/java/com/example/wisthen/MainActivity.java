package com.example.wisthen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private EditText EditText_main;
    private Button Button_main;
    private String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button_main = (Button) findViewById(R.id.btn_main);
        Button_main.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText_main = findViewById(R.id.EditText_main);
                str = EditText_main.getText().toString();
                Intent intent = new Intent(getApplicationContext(), ChatActivity.class);
                intent.putExtra("str", str);
                startActivity(intent);
            }
        });


    }


}