package com.example.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView tv_result;
     Button bt_convert;
     EditText et_jarda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = findViewById(R.id.tv_result);
        bt_convert = findViewById(R.id.bt_convert);
        et_jarda = findViewById(R.id.et_jarda);

        bt_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valorJarda = Double.parseDouble(et_jarda.getText().toString());
                DecimalFormat arredondar = new DecimalFormat("#,##");
                double valorCenti = Double.parseDouble(arredondar.format(valorJarda*91.44));
                tv_result.setText("O valor em Jardas é "+ String.valueOf(valorCenti));
            }
        });
    }
}