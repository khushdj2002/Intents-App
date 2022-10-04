package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText sub_num1,sub_num2;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sub_num1 = findViewById(R.id.sub_num1);
        sub_num2 = findViewById(R.id.sub_num2);
        btn4 = findViewById(R.id.btn4);

        Intent i = getIntent();
        sub_num1.setText(i.getStringExtra("num1"));
        sub_num2.setText(i.getStringExtra("num2"));

        int a = Integer.parseInt(sub_num1.getText().toString());
        int b =Integer.parseInt(sub_num2.getText().toString());

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                intent.putExtra("res",a-b);
                setResult(RESULT_OK,intent);
                finish();;
            }
        });
    }
}