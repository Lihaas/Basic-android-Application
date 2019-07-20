package com.example.android.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText value;
TextView result;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 0.014;
                    result.setText(String.valueOf(re));
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 0.013;
                    result.setText(String.valueOf(re));
                }
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 0.0073;
                    result.setText(String.valueOf(re));
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 1.00;
                    result.setText(String.valueOf(re));
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 0.016;
                    result.setText(String.valueOf(re));
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 0.0091;
                    result.setText(String.valueOf(re));
                }
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 0.21;
                    result.setText(String.valueOf(re));
                }
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 0.061;
                    result.setText(String.valueOf(re));
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
                String s = value.getText().toString();
                if(!s.isEmpty()) {
                    double ss = Double.parseDouble(s);
                    double re = ss * 0.060;
                    result.setText(String.valueOf(re));
                }
            }
        });

    }

    void findId(){
        value = findViewById(R.id.txtValue);
        result = findViewById(R.id.result);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);


    }
}
