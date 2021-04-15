package com.example.calculator_hinhhopchunhat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText chieurong,chieudai,chieucao;
    private RadioButton radioS,radioV;
    private Button btnAdd;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
            chieurong = findViewById(R.id.txtcanh1);
            chieudai = findViewById(R.id.txtcanh2);
            chieucao = findViewById(R.id.txtcanh3);
            radioS= findViewById(R.id.radioS);
            radioV=findViewById(R.id.radioV);
            btnAdd=findViewById(R.id.btnAdd);
            res=findViewById(R.id.res);
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int a = Integer.parseInt(chieurong.getText().toString());
                    int b = Integer.parseInt(chieudai.getText().toString());
                    int c = Integer.parseInt(chieucao.getText().toString());
                    if(radioS.isChecked()){
                        res.setText(String.valueOf(2*(a*b+a*c+b*c)));
                    }
                    else res.setText(String.valueOf(a*b*c));
                }
            });
    }
}