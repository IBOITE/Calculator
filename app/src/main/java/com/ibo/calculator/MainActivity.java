package com.ibo.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //تعريف الاشياء الموجودة بالواجهة
    TextView textView;
    EditText editText1, editText2;
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //بايا واجهة مربوط
        setContentView(R.layout.activity_main);
        //ربط الاشياء الموجودة بالواجهة بلغة جاغا
        textView=findViewById(R.id.myresult);
        editText1=findViewById(R.id.num1);
        editText2=findViewById(R.id.num2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=editText1.getText().toString();
                String num2=editText2.getText().toString();

                if(num1.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"please Input num",Toast.LENGTH_SHORT).show();
                }
                else if(num2.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"please Input num",Toast.LENGTH_SHORT).show();
                }
                else {
                    Double input1=Double.parseDouble(num1);
                    Double input2=Double.parseDouble(num2);
                    clickMulti(input1,input2);
                    textView.setText(clickMulti(input1,input2)+"");
                }
            }
        });
    }

    private Double clickMulti(Double number1,Double number2){
        return number1*number2;
    }




    public void clickSum(View v)
    {
        //مشان يتاكد اذا المدخلات ارقام
        if(TextUtils.isDigitsOnly(editText1.getText().toString())&&TextUtils.isDigitsOnly(editText2.getText().toString())&& !TextUtils.isEmpty(editText1.getText().toString()) && !TextUtils.isEmpty(editText2.getText().toString()))
        {
            double mynum1=Double.parseDouble(editText1.getText().toString());
            double mynum2=Double.parseDouble(editText2.getText().toString());
            textView.setText(mynum1+mynum2 +"");
        }else{
            textView.setText("plase put num");
        }

    }
}