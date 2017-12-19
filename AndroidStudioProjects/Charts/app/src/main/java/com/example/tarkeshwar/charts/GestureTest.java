package com.example.tarkeshwar.charts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Highlight;

/**
 * Created by tarkeshwar on 24/1/17.
 */

public class GestureTest extends AppCompatActivity implements View.OnClickListener,OnChartGestureListener, OnChartValueSelectedListener {
    private LineChart mChart;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mChart=new LineChart(this);
mChart.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mChart.setOnClickListener(this);
        mChart.setOnChartGestureListener(this);
        mChart.setOnChartValueSelectedListener(this);
        setContentView(mChart);


    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),"You have Clicked at "+v.getId(),Toast.LENGTH_LONG).show();

    }

    @Override
    public void onChartLongPressed(MotionEvent motionEvent) {
        Toast.makeText(getApplicationContext(),"Long Pressed "+motionEvent.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onChartDoubleTapped(MotionEvent motionEvent) {
        Toast.makeText(getApplicationContext(),"Double Tapped "+motionEvent.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onChartSingleTapped(MotionEvent motionEvent) {
        Toast.makeText(getApplicationContext(),"Single Tapped "+motionEvent.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onChartFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Toast.makeText(getApplicationContext(),v+" "+motionEvent.toString()+" Chart Flinged "+motionEvent1.toString()+" "+v,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onChartScale(MotionEvent motionEvent, float v, float v1) {
        Toast.makeText(getApplicationContext(),v+" "+motionEvent.toString()+" Chart Scale "+v,Toast.LENGTH_LONG).show();


    }

    @Override
    public void onChartTranslate(MotionEvent motionEvent, float v, float v1) {
        Toast.makeText(getApplicationContext(),v+" "+motionEvent.toString()+" Chart Translate "+v,Toast.LENGTH_LONG).show();


    }

    @Override
    public void onValueSelected(Entry entry, int i, Highlight highlight) {
        Toast.makeText(getApplicationContext(),entry.getXIndex()+" "+i+" OnValue selected "+highlight.getStackIndex(),Toast.LENGTH_LONG).show();


    }

    @Override
    public void onNothingSelected() {

    }
}
