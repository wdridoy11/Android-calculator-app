package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView calculator_output, clear,delete,percent,division,number_seven,number_eight,number_nine,
            multiply, number_four, number_five, number_six, plus, number_one, number_two, number_three,
            minus, double_zero, zero, multiply_dot, equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

// ========== id select ==========
        calculator_output = findViewById(R.id.calculator_output);
        double_zero = findViewById(R.id.double_zero);
        zero  = findViewById(R.id.zero);
        number_one = findViewById(R.id.number_one);
        number_two = findViewById(R.id.number_two);
        number_three = findViewById(R.id.number_three);
        number_four = findViewById(R.id.number_four);
        number_five = findViewById(R.id.number_five);
        number_six = findViewById(R.id.number_six);
        number_seven = findViewById(R.id.number_seven);
        number_eight = findViewById(R.id.number_eight);
        number_nine = findViewById(R.id.number_nine);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        division = findViewById(R.id.division);
        multiply_dot  = findViewById(R.id.multiply_dot);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.delete);
        percent = findViewById(R.id.percent);











    }
}