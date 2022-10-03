package com.example.intentsapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2,resu;
    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       num1 = findViewById(R.id.num1);
       num2 = findViewById(R.id.num2);
       resu=findViewById(R.id.result);
       Btn = findViewById(R.id.btn);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("num1",num1.getText().toString());
                intent.putExtra("num2",num2.getText().toString());
                startActivityForResult(intent,0);

            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode,@Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode==0){
            if (resultCode==RESULT_OK){
                int res = data.getIntExtra("res",0);
                resu.setText(String.valueOf(res));
            }
        }
    }
}