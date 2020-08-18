package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView textview1;
    TextView textview2;
    TextView textview3;
    Button bn1;
    int result,num,num2,number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textview1=findViewById(R.id.num1);
        textview2=findViewById(R.id.num2);
        textview3=findViewById(R.id.Value_2);
        Intent intent=getIntent();
        final int num=intent.getIntExtra("Num_1",0);
        textview1.setText(String.valueOf(num));
        final int num2=intent.getIntExtra("Num_2",0);
        textview2.setText(String.valueOf(num2));





        Toast toast = Toast.makeText(getApplicationContext(), "sending message", Toast.LENGTH_LONG);
        toast.show();
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);


    }






}