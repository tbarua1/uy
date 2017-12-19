package com.example.tarkeshwar.withoutxml;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        Button changeColor = new Button(this);
        changeColor.setText("Color");
        changeColor.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        changeColor.setOnClickListener(new View.OnClickListener() {
            int[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
            @Override
            public void onClick(View view) {
                final Random random = new Random();
                view.setBackgroundColor(colors[random.nextInt(colors.length - 1) + 1]);
            }
        });
        setContentView(changeColor);
    }
}
