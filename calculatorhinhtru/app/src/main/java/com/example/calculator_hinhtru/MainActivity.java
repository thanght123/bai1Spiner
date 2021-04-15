package com.example.calculator_hinhtru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtChieucao,txtBankinh;
    private Button btnTinh;
    private TextView res;
    private RadioButton radioDientich,radioThetich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        res = findViewById(R.id.res);
        txtBankinh=findViewById(R.id.txtBankinh);
        txtChieucao=findViewById(R.id.txtChieucao);
        btnTinh=findViewById(R.id.btnTinh);
        radioDientich=findViewById(R.id.radioDientich);
        radioThetich=findViewById(R.id.radioThetich);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pi = Math.PI;
                double r = Double.parseDouble(txtBankinh.getText().toString());
                int h = Integer.parseInt(txtChieucao.getText().toString());
                if (radioDientich.isChecked()){
                    res.setText(String.valueOf(h*r*pi*2+2*pi*r*r));

                }
                else {
                    res.setText(String.valueOf(2*pi*h*r*r));
                }
            }
        });

    }
}