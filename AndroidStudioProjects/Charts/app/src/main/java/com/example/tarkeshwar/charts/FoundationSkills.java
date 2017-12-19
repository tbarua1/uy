package com.example.tarkeshwar.charts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;


import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import org.codehaus.jackson.map.ObjectMapper;

import java.util.ArrayList;

/**
 * Created by tarkeshwar on 17/1/17.
 */

public class FoundationSkills extends AppCompatActivity {
    private String url="http://192.168.0.109:8080/BHT/GraphFS";
    private String dataFromServer;
    private ObjectMapper mapper;
    /*GraphFS
    * GraphFS
{"completed":3485,"ongoing":3871,"scheduled":0,"projected":0} */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.foundation_skills);
        PieChart pieChart = new PieChart(this);
        pieChart.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(pieChart);
// creating data values
                ArrayList <Entry> entries = new ArrayList();
                entries.add(new Entry(4f, 0));
                entries.add(new Entry(8f, 1));
                entries.add(new Entry(6f, 2));
                entries.add(new Entry(12f, 3));
                entries.add(new Entry(18f, 4));
                entries.add(new Entry(9f, 5));

    PieDataSet dataset = new PieDataSet(entries,"No C");
        ArrayList<String> labels = new ArrayList<String>();
                labels.add("January");
                labels.add("February");
                labels.add("March");
                labels.add("April");
                labels.add("May");
                labels.add("June");
PieData data = new PieData(labels, dataset);
    pieChart.setData(data);
     pieChart.setDescription("Description");

    }
}
