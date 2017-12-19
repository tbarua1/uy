package com.example.tarkeshwar.checkboxtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private CheckBox First,Second,Third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        First = (CheckBox)findViewById(R.id.checkBox1);
        Second = (CheckBox)findViewById(R.id.checkBox2);
        Third = (CheckBox)findViewById(R.id.checkBox3);

        //First CheckBox
        First.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(First.isChecked())
                {
                    Toast.makeText(MainActivity.this,"First checkbox checked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"First checkbox Unchecked", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //Second CheckBox
        Second.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Second.isChecked())
                {
                    Toast.makeText(MainActivity.this,"Second checkbox checked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Second checkbox Unchecked", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //Third CheckBox

        Third.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Third.isChecked())
                {
                    Toast.makeText(MainActivity.this,"Third checkbox checked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Third checkbox Unchecked", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
