package com.ssuji.numberandshapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    public void Check(View view) {

        class Verify {
            private int number;

            private boolean isTriangular() {
                int i = 0, triangularNumber = 0;
                while (triangularNumber < number) {
                    i++;
                    triangularNumber += i;
                }
                return triangularNumber == number;
            }

            private boolean isSquare() {
                double squareNumber = Math.sqrt(number);
                return squareNumber == Math.floor(squareNumber);

            }

        }
        EditText editText = findViewById(R.id.numberEntered);
        Verify value = new Verify();
        if (editText.getText().toString().isEmpty())
            Toast.makeText(this, "Please enter a number!", Toast.LENGTH_SHORT).show();
        else {
            value.number = Integer.parseInt(editText.getText().toString());
            if (value.isTriangular() && value.isSquare())
                Toast.makeText(this, value.number + " is both triangular and square number", Toast.LENGTH_SHORT).show();
            else if (value.isSquare())
                Toast.makeText(this, value.number + " is square but not triangular number", Toast.LENGTH_SHORT).show();
            else if (value.isTriangular())
                Toast.makeText(this, value.number + " is triangular but not square number", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, value.number + " is neither triangular nor square number", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
