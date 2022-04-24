package com.example.calculate_aibekovaibolotain_2_20;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_add, btn_minus,btn_mult,btn_div,btn_root,btn_square;
    EditText number1, number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        clickListener();
    }
    private void init(){
        btn_root=findViewById(R.id.root);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        btn_add = findViewById(R.id.but_plus);
        btn_minus = findViewById(R.id.but_minus);
        btn_mult = findViewById(R.id.but_mul);
        btn_div = findViewById(R.id.btn_div);
        result = findViewById(R.id.result);
        btn_square = findViewById(R.id.btn_square);


    }
    private void clickListener(){
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a;
                int b;
                int c;
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                c=a+b;
                result.setText(String.valueOf(c));//преобразуент int в фориат string
            }

        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a2;
                int b2;
                int c2;
                a2 = Integer.parseInt(number1.getText().toString());
                b2 = Integer.parseInt(number2.getText().toString());
                c2=a2*b2;
                result.setText(String.valueOf(c2));//преобразуент int в фориат string
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a3;
                float b3;
                float c3;
                a3 = Float.parseFloat(number1.getText().toString());
                b3 = Float.parseFloat(number2.getText().toString());
                c3=a3/b3;
                result.setText(String.valueOf(c3));//преобразуент int в фориат string
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a4;
                int b4;
                int c4;
                a4 = Integer.parseInt(number1.getText().toString());
                b4 = Integer.parseInt(number2.getText().toString());
                c4=a4-b4;
                result.setText(String.valueOf(c4));//преобразуент int в фориат string
            }
        });
        btn_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a5;
                double c5;
                a5 = Double.parseDouble(number1.getText().toString());
                c5 = Math.sqrt(a5);
                result.setText(String.valueOf(c5));
                ;//преобразуент int в фориат string
            }
        });
        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a6;
                double c6;
                a6 = Double.parseDouble(number1.getText().toString());
                c6 = a6*a6;
                result.setText(String.valueOf(c6));
                ;//преобразуент int в фориат string
            }
        });


    }
}