package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FristActivity extends AppCompatActivity {
    public static final String EXTRA_NUMBER="com.example.intentsproj.example.EXTRA_NUMBER";
    Button button;
    EditText n1,n2;
    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        button=findViewById(R.id.btn1);
        n1=findViewById(R.id.num_1);

        n2=findViewById(R.id.num_2);











        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                    int num1;
                    int num2;
                     num1=Integer.parseInt(n1.getText().toString());
                      intent.putExtra("Num_1",num1);
                      num2=Integer.parseInt(n2.getText().toString());
                      intent.putExtra("Num_2",num2);

                startActivity(intent);
            }
        });



    }






    }

