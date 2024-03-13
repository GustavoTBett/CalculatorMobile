package com.gustavo.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private StringBuilder textoCalc = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button4);
        Button button3 = findViewById(R.id.button5);
        Button buttonPlus = findViewById(R.id.button6);
        Button button1 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button14);
        Button buttonMinus = findViewById(R.id.button9);
        Button buttonMultiply = findViewById(R.id.button12);
        Button button6 = findViewById(R.id.button8);
        Button button0 = findViewById(R.id.button18);
        Button button9 = findViewById(R.id.button13);
        Button button7 = findViewById(R.id.button11);
        Button buttonEquals = findViewById(R.id.button17);
        Button button5 = findViewById(R.id.button10);
        Button buttonDivide = findViewById(R.id.button16);
        Button buttonClean = findViewById(R.id.button15);
        TextView textView = findViewById(R.id.textView);


        button0.setOnClickListener(click -> {
            if (!textoCalc.toString().isEmpty()) {
                textoCalc.append("0");
                textView.setText(textoCalc.toString());
            }
        });
        button1.setOnClickListener(click -> {
            textoCalc.append("1");
            textView.setText(textoCalc.toString());
        });
        button2.setOnClickListener(click -> {
            textoCalc.append("2");
            textView.setText(textoCalc.toString());
        });
        button3.setOnClickListener(click -> {
            textoCalc.append("3");
            textView.setText(textoCalc.toString());
        });
        button4.setOnClickListener(click -> {
            textoCalc.append("4");
            textView.setText(textoCalc.toString());
        });
        button5.setOnClickListener(click -> {
            textoCalc.append("5");
            textView.setText(textoCalc.toString());
        });
        button6.setOnClickListener(click -> {
            textoCalc.append("6");
            textView.setText(textoCalc.toString());
        });
        button7.setOnClickListener(click -> {
            textoCalc.append("7");
            textView.setText(textoCalc.toString());
        });
        button8.setOnClickListener(click -> {
            textoCalc.append("8");
            textView.setText(textoCalc.toString());
        });
        button9.setOnClickListener(click -> {
            textoCalc.append("9");
            textView.setText(textoCalc.toString());
        });

        buttonClean.setOnClickListener(click -> {
            textoCalc = new StringBuilder();
            textView.setText(textoCalc.toString());
        });

        buttonPlus.setOnClickListener(click -> {
            String text = textoCalc.toString();
            if (!text.contains("+") && !text.contains("-") && !text.contains("*") && !text.contains("/")) {
                textoCalc.append("+");
                textView.setText(textoCalc.toString());
            }
        });

        buttonMinus.setOnClickListener(click -> {
            String text = textoCalc.toString();
            if (!text.contains("+") && !text.contains("-") && !text.contains("*") && !text.contains("/")) {
                textoCalc.append("-");
                textView.setText(textoCalc.toString());
            }
        });

        buttonMultiply.setOnClickListener(click -> {
            String text = textoCalc.toString();
            if (!text.contains("+") && !text.contains("-") && !text.contains("*") && !text.contains("/")) {
                textoCalc.append("*");
                textView.setText(textoCalc.toString());
            }
        });

        buttonDivide.setOnClickListener(click -> {
            String text = textoCalc.toString();
            if (!text.contains("+") && !text.contains("-") && !text.contains("*") && !text.contains("/")) {
                textoCalc.append("/");
                textView.setText(textoCalc.toString());
            }
        });

        buttonEquals.setOnClickListener(click -> {
            String text = textoCalc.toString();
            if (text.matches(".*\\+\\d.*")) {
                String[] split = textoCalc.toString().split("\\+");
                Long primeiraParte = Long.valueOf(split[0]);
                Long segundaParte = Long.valueOf(split[1]);
                Long result = primeiraParte + segundaParte;
                textView.setText(result.toString());
            }
            if (text.matches(".*\\-\\d.*")) {
                String[] split = textoCalc.toString().split("\\-");
                Long primeiraParte = Long.valueOf(split[0]);
                Long segundaParte = Long.valueOf(split[1]);
                Long result = primeiraParte - segundaParte;
                textView.setText(result.toString());
            }
            if (text.matches(".*\\*\\d.*")) {
                String[] split = textoCalc.toString().split("\\*");
                Long primeiraParte = Long.valueOf(split[0]);
                Long segundaParte = Long.valueOf(split[1]);
                Long result = primeiraParte * segundaParte;
                textView.setText(result.toString());
            }
            if (text.matches(".*\\/\\d.*")) {
                String[] split = textoCalc.toString().split("\\/");
                Long primeiraParte = Long.valueOf(split[0]);
                Long segundaParte = Long.valueOf(split[1]);
                Long result = primeiraParte / segundaParte;
                textView.setText(result.toString());
            }
        });
    }
}