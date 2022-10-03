package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
        EditText dup_num1,dup_num2;
        Button Btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         dup_num1 = findViewById(R.id.dp_num1);
         dup_num2= findViewById(R.id.dp_num2);
         Btn2 = findViewById(R.id.btn2);

        Intent i =getIntent();
         dup_num1.setText(i.getStringExtra("num1"));
         dup_num2.setText(i.getStringExtra("num2"));

         int a = Integer.parseInt(dup_num1.getText().toString());
         int b = Integer.parseInt(dup_num2.getText().toString());
            Btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                    intent.putExtra("res",a+b);
                    setResult(RESULT_OK,intent);
                    finish();
                }
            });


    }
}