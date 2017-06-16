package com.example.minhl.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnResult;
    private EditText edtNumberA, edtNumberB;
    private int a , b;
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult= (Button) findViewById(R.id.btn_result);
        edtNumberA = (EditText) findViewById(R.id.edt_a);
        edtNumberB= (EditText) findViewById(R.id.edt_b);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edtNumberA.getText().toString().equals("") && !edtNumberB.getText().toString().equals("")){
                    a = Integer.parseInt(edtNumberA.getText().toString());
                    b = Integer.parseInt(edtNumberB.getText().toString());
                    result = String.valueOf(a*b);
                    Toast.makeText(MainActivity.this, "Kết quả của "+a+"+"+b+" là:" + result, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Dữ liệu nhập vào không hợp ", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
