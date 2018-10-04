package com.example.user.calculadora_radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    private EditText et1,et2;
    private TextView tv1;
    private Button btnc;
    private RadioButton rbtn1, rbtn2, rbtn3, rbtn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tv1 = (TextView)findViewById(R.id.tv1);

    et1 = (EditText)findViewById(R.id.et1);
    et2 = (EditText)findViewById(R.id.et2);

    btnc = (Button)findViewById(R.id.btnc);
    btnc.setOnClickListener(this);
    rbtn1 = (RadioButton)findViewById(R.id.rbtn1);
    //rbtn1.setOnClickListener(this);
    rbtn2 = (RadioButton)findViewById(R.id.rbtn2);
    //rbtn2.setOnClickListener(this);
    rbtn3 = (RadioButton)findViewById(R.id.rbtn3);
    //rbtn3.setOnClickListener(this);
    rbtn4 = (RadioButton)findViewById(R.id.rbtn4);
    //rbtn4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

            String num1 = String.valueOf(et1.getText());
            String num2 = String.valueOf(et2.getText());
            Double total = null;

            if(rbtn1.isChecked())
            {
                total = Double.valueOf(num1) + Double.valueOf(num2);
            }
            else if (rbtn2.isChecked())
            {
                total = Double.valueOf(num1) - Double.valueOf(num2);
            }
            else if (rbtn3.isChecked())
            {
                total = Double.valueOf(num1) * Double.valueOf(num2);
            }
            else if (rbtn4.isChecked())
            {
                total = Double.valueOf(num1) / Double.valueOf(num2);
            }
            tv1.setText(String.format("%.2f", total));
    }
}
