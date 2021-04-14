package com.example.a5widgetdemo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Scanner;

public class MainActivity2 extends AppCompatActivity {
    private Spinner mSpiner;
    private Button btnAdd;
    private EditText mNum1, mNum2;
    private String s1,s2;
    private TextView txt;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        initView();
        addSpiner();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double pi = Math.PI;
                String ans="RESULT: ";
                txt.setText(ans);
                int number1=Integer.parseInt(mNum1.getText().toString());
                int number2=Integer.parseInt(mNum2.getText().toString());
                String method=mSpiner.getSelectedItem().toString();
                if(method.equalsIgnoreCase("+")){
                    ans+=""+(pi*number1+number2);
                }else if(method.equalsIgnoreCase("-")){
                    ans+=""+(number1-number2);
                }else if(method.equalsIgnoreCase("x")){
                    ans+=""+(number1*number2);
                }else {
                    if(number2!=0)
                        ans+=""+((double)number1/number2);
                    else ans+="Ban phai chia so khac 0";
                }
                txt.setText(ans);
            }
        });

    }
    public void initView(){
        mSpiner = findViewById(R.id.spin1);
        btnAdd = findViewById(R.id.btnAdd);
        txt = findViewById(R.id.text2);
        mNum1 = findViewById(R.id.num1);
        mNum2 = findViewById(R.id.num2);
    }
    public void addSpiner(){
        String[] cal ={"+","-","x","/"};
        ArrayAdapter<String> data = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,cal);
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpiner.setAdapter(data);
    }
}
