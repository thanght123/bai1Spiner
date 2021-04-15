package com.example.calculator_hinhcau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtTen,txtBankinh;
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
        txtTen= findViewById(R.id.txtTen);
        txtBankinh=findViewById(R.id.txtBankinh);
        btnTinh=findViewById(R.id.btnTinh);
        radioDientich=findViewById(R.id.radioDientich);
        radioThetich=findViewById(R.id.radioThetich);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double pi = Math.PI;
                String name = txtTen.getText().toString();
                double r = Double.parseDouble(txtBankinh.getText().toString());
                if(radioDientich.isChecked()){
                    if(name.isEmpty())
                        res.setText(""+(4*pi*r*r));
                    else res.setText("duoc tinh boi " +name+ ":"+(4*pi*r*r) );
                }
                else{
                    if(name.isEmpty())
                        res.setText(String.valueOf(r*pi*r*r*3/4));
                    else res.setText("duoc tinh boi " +name+ ": "+String.valueOf(r*pi*r*r*3/4) );
                }
            }
        });


    }
}