package com.example.csc250_class_lab_4_9_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText editTextNumber;
    private EditText editTextNumber2;
    private EditText editTextNumber3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editTextNumber = this.findViewById(R.id.editTextNumber);
        this.editTextNumber2 = this.findViewById(R.id.editTextNumber2);
        this.editTextNumber3 = this.findViewById(R.id.editTextNumber3);


    }
    public void onFactorialButtonClicked(View v) {
        String currValue = this.editTextNumber.getText().toString();
        String currValue = this.editTextNumber2.getText().toString();
        this.editTextNumber3.setText(currValue);

        import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                long AA = A * A;
                long BB = B * B;
                long C2 = C * C;
                double ans = (double) C2 / (double) (AA + BB);
                System.out.println(editTextNumber3);
            }


        }
}
