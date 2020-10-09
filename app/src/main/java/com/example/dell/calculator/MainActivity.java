package com.example.dell.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot;
    Button btnAdd, btnMul, btnMinus, btnDivide, btnPercentage;
    Button btnClear, btnAns;
    ImageButton btnBackSpace;
    EditText number;
    TextView temp;

    boolean plus = false;
    boolean minus = false;
    boolean division = false;
    boolean mul = false;
    boolean percentage = false;

    String num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        number = findViewById(R.id.number);
        temp = findViewById(R.id.temp);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDot = findViewById(R.id.btnDot);

        btnAdd = findViewById(R.id.btnAdd);
        btnMul = findViewById(R.id.btnMul);
        btnDivide = findViewById(R.id.btnDivide);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnMinus = findViewById(R.id.btnMinus);

        btnClear = findViewById(R.id.btnClear);
        btnAns = findViewById(R.id.btnAns);
        btnBackSpace = findViewById(R.id.btnBackSpace);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + "9");
            }
        });


        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int last = number.getText().toString().length();
                if (!number.getText().toString().equals("")) {
                    number.setText(number.getText().delete(last - 1, last));
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(null);
                temp.setText(null);
                plus = false;
                minus = false;
                division = false;
                mul = false;
                percentage = false;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number == null) {
                    number.setText("");
                } else {
                    num1 = number.getText().toString();
                    plus = true;
                    number.setText(null);
                    temp.setText(num1 + " + ");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number == null) {
                    number.setText("");
                } else {
                    num1 = number.getText().toString();
                    mul = true;
                    number.setText(null);
                    temp.setText(num1 + " x ");
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number == null) {
                    number.setText("");
                } else {
                    num1 = number.getText().toString();
                    division = true;
                    number.setText(null);
                    temp.setText(num1 + " / ");
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number == null) {
                    number.setText("");
                } else {
                    num1 = number.getText().toString();
                    minus = true;
                    number.setText(null);
                    temp.setText(num1 + " - ");
                }
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number == null) {
                    number.setText("");
                } else {
                    num1 = number.getText().toString();
                    percentage = true;
                    number.setText(null);
                    temp.setText(num1 + " % ");
                }
            }
        });

        btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number != null) {
                    num2 = number.getText().toString();
                    temp.setText(temp.getText() + num2);
                    if (plus) {
                        number.setText(Double.parseDouble(num1) + Double.parseDouble(num2) + "");
                        plus = false;
                    }

                    if(minus){
                        number.setText(Double.parseDouble(num1) - Double.parseDouble(num2) + "");
                        minus = false;
                    }

                    if(mul){
                        number.setText(Double.parseDouble(num1) * Double.parseDouble(num2) + "");
                        mul = false;
                    }

                    if (division){
                        number.setText(Double.parseDouble(num1) / Double.parseDouble(num2) + "");
                        division = false;
                    }

                    if (percentage){
                        number.setText(Double.parseDouble(num1) % Double.parseDouble(num2) + "");
                        percentage = false;
                    }

                }
            }
        });

    }
}
