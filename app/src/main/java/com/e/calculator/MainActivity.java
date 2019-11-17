package com.e.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ettext;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnMinus, btnMultiply, btnDivide,
            btnCancel, btnTotal;
    TextView tvview;
    Integer result = 0;
    public int id = 0;

    public int one, two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ettext = findViewById(R.id.ettext);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnCancel = findViewById(R.id.btnCancel);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnTotal = findViewById(R.id.btnTotal);

        tvview = findViewById(R.id.tvview);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 1;
                if (TextUtils.isEmpty(ettext.getText())) {
                    ettext.setError("Enter number first");
                    return;
                }
                one = Integer.parseInt(ettext.getText().toString());
                tvview.setText(one + " +");
                ettext.getText().clear();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 2;
                if (TextUtils.isEmpty(ettext.getText())) {
                    ettext.setError("Enter number first");
                    return;
                }
                one = Integer.parseInt(ettext.getText().toString());
                tvview.setText(one + " - ");
                ettext.getText().clear();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 3;
                if (TextUtils.isEmpty(ettext.getText())) {
                    ettext.setError("Enter some number first");
                    return;
                }
                one = Integer.parseInt(ettext.getText().toString());
                tvview.setText(one + " * ");
                ettext.getText().clear();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 4;
                if (TextUtils.isEmpty(ettext.getText())) {
                    ettext.setError("Enter number first");
                    return;
                }
                one = Integer.parseInt(ettext.getText().toString());
                tvview.setText(one + " / ");
                ettext.getText().clear();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.getText().clear();
                tvview.setText("");
            }
        });

        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(ettext.getText())) {
                    ettext.setError("Enter number first");
                    return;
                }

                two = Integer.parseInt(ettext.getText().toString());

                Arthematic arthmetic = new Arthematic(one, two);
                if (id == 1) {
                    tvview.setText(arthmetic.displayAdd());
                    ettext.setText(String.valueOf(arthmetic.add()));
                } else if (id == 2) {
                    tvview.setText(arthmetic.displaySub());
                    ettext.setText(String.valueOf(arthmetic.sub()));
                } else if (id == 3) {
                    tvview.setText(arthmetic.displayMultiply());
                    ettext.setText(String.valueOf(arthmetic.multiply()));
                } else if (id == 4) {
                    tvview.setText(arthmetic.displayDivide());
                    ettext.setText(String.valueOf(arthmetic.divide()));
                }
                Toast.makeText(MainActivity.this, "One is" + two, Toast.LENGTH_SHORT).show();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ettext.setText(ettext.getText().toString() + "0");
            }
        });
    }
}
