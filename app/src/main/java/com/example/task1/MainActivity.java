package com.example.task1;

import static android.text.method.TextKeyListener.clear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Input;
    TextView Output;
    Float res1,res2;
    Button one,two,three,four,five,six,seven,eight,nine,zero,ac,no,dot,equals,reset,badd,bsub,bmul,bdiv,bpercentage;
    Boolean add,sub,mul,div,percentage;

    void clear()
    {
        res1=null;
        Input.setText(null);
        SetFalse();
    }

    void storePre()
    {
        res1 = Float.parseFloat(Input.getText() + "");
    }

    void SetFalse()
    {
        add=sub=mul=div=percentage=false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input =findViewById(R.id.input);
        Output =findViewById(R.id.output);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        badd = findViewById(R.id.add);
        bsub = findViewById(R.id.sub);
        bmul = findViewById(R.id.mul);
        bdiv = findViewById(R.id.div);
        dot = findViewById(R.id.dot);
        equals = findViewById(R.id.equals);
        ac = findViewById(R.id.AC);
        no = findViewById(R.id.no);
        bpercentage = findViewById(R.id.percentage);
        reset = findViewById(R.id.reset);



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("");
                Output.setText("");
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText("");
                Output.setText("");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + "0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Input.setText(Input.getText().toString() + ".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Input==null)
                {
                    Input.setText("");
                }
                else
                {
                    storePre();
                    SetFalse();
                    add=true;
                    Input.setText(null);
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Input==null)
                {
                    Input.setText("");
                }
                else
                {
                    storePre();
                    SetFalse();
                    sub=true;
                    Input.setText(null);
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Input==null)
                {
                    Input.setText("");
                }
                else
                {
                    storePre();
                    SetFalse();
                    mul=true;
                    Input.setText(null);
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Input==null)
                {
                    Input.setText("");
                }
                else
                {
                    storePre();
                    SetFalse();
                    div=true;
                    Input.setText(null);
                }
            }
        });

        bpercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Input==null)
                {
                    Input.setText("");
                }
                else
                {
                    storePre();
                    SetFalse();
                    percentage=true;
                    Input.setText(null);
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(add)
                {
                    Output.setText(res1+Float.parseFloat(Input.getText()+"")+"");
                }
                if(sub)
                {
                    Output.setText(res1-Float.parseFloat(Input.getText()+"")+"");
                }
                if(mul)
                {
                    Output.setText(res1*Float.parseFloat(Input.getText()+"")+"");
                }
                if(div)
                {
                    Output.setText(res1/Float.parseFloat(Input.getText()+"")+"");
                }
                if(percentage)
                {
                    Output.setText(res1%Float.parseFloat(Input.getText()+"")+"");
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });




    }




}