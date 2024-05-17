package com.example.task1;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14,
            button15, button16, button17,button18;
    String s = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18=findViewById(R.id.button18);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button1.getText().toString().trim();
                editText.setText(s);
                String e = button1.getText().toString();
                Log.e("val is ", e);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button2.getText().toString().trim();
                editText.setText(s);
                String e = button2.getText().toString();
                Log.e("val is ", e);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=""; //blank val it takes
                editText.setText(s);
//                String e = button3.getText().toString();
//                Log.e("val is ", e);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button4.getText().toString().trim();
                editText.setText(s);
                String e = button4.getText().toString();
                Log.e("val is ", e);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button5.getText().toString().trim();
                editText.setText(s);
                String e = button5.getText().toString();
                Log.e("val is ", e);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button6.getText().toString().trim();
                editText.setText(s);
                String e = button6.getText().toString();
                Log.e("val is ", e);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button7.getText().toString().trim();
                editText.setText(s);
                String e = button7.getText().toString();
                Log.e("val is ", e);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button8.getText().toString().trim();
                editText.setText(s);
                String e = button8.getText().toString();
                Log.e("val is ", e);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button9.getText().toString().trim();
                editText.setText(s);
                String e = button9.getText().toString();
                Log.e("val is ", e);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button10.getText().toString().trim();
                editText.setText(s);
                String e = button10.getText().toString();
                Log.e("val is ", e);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button11.getText().toString().trim();
                editText.setText(s);
                String e = button11.getText().toString();
                Log.e("val is ", e);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button12.getText().toString().trim();
                editText.setText(s);
                String e = button12.getText().toString();
                Log.e("val is ", e);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button13.getText().toString().trim();
                editText.setText(s);
                String e = button13.getText().toString();
                Log.e("val is ", e);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button14.getText().toString().trim();
                editText.setText(s);
                String e = button14.getText().toString();
                Log.e("val is ", e);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button15.getText().toString().trim();
                editText.setText(s);
                String e = button15.getText().toString();
                Log.e("val is ", e);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button16.getText().toString().trim();
                editText.setText(s);
                String e = button16.getText().toString();
                Log.e("val is ", e);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=s+button17.getText().toString().trim();
                editText.setText(s);
                String e = button17.getText().toString();
                Log.e("val is ", e);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View view) {
                  s=button18.getText().toString().trim();
                 String op=" ";
                 if(!s.isEmpty() || s!=" "){
                     String t=editText.getText().toString();
//                     char [] c=t.toCharArray();
                     String[] c = t.split("\\+|\\-|\\*|\\/|\\%|\\=");
                     Log.e("vall is ", Arrays.toString(t.toCharArray()));
                        for(char ch:t.toCharArray()) { //need to convert in char array so that we can easily fetch value 12+3 fetch + like that
                            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                                op = String.valueOf(ch);
                                break;
                            }
                        }
                     double i1=Double.parseDouble(String.valueOf(c[0]));
                     double i3=Double.parseDouble(String.valueOf(c[1]));
                     Log.e("operator is ",op);
                     Log.e("i1 is ", String.valueOf(i1));
                     Log.e("i3 is ",String.valueOf(i3));
                     double i55=0.0;
                     switch (op){
                         case "+":
                             i55=i1+i3;
                             Log.e("i1 val is ", String.valueOf(i1));
                             Log.e("i3 val is ",String.valueOf(i3));
                             s= String.valueOf(i55);
                             editText.setText(s);
                             Log.e("val +",op);
                             break;

                         case "-":
                             i55=i1-i3;
                             Log.e("i1 val is ", String.valueOf(i1));
                             Log.e("i3 val is ",String.valueOf(i3));
                             s= String.valueOf(i55);
                             editText.setText(s);
                             Log.e("val +",op);
                             break;

                         case "*":
                             i55=i1*i3;
                             s= String.valueOf(i55);
                             editText.setText(s);
                             break;

                         case "/":
                             i55=i1/i3;
                             s= String.valueOf(i55);
                             editText.setText(s);
                             break;

                         case "%":
                             i55=i1%i3;
                             s= String.valueOf(i55);
                             editText.setText(s);
                             break;


                     }

                 }
        }
    });
    }
}