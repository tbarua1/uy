package com.example.tarkeshwar.piechart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int data_values[] = { 2,1,2,5,1,2};
        int color_values[] = {Color.MAGENTA, Color.RED, Color.GREEN,Color.BLUE,Color.YELLOW,Color.CYAN};
        String itemnames[] = { "item 1", "item 2", "item 3", "item 4", "item 5","item 6"};

        //get the imageview
        ImageView imgView = (ImageView ) findViewById(R.id.image_placeholder);

        //create pie chart Drawable and set it to ImageView
        PieChart pieChart = new PieChart(this, imgView, itemnames, data_values, color_values);
        imgView.setImageDrawable(pieChart);
    }
}
