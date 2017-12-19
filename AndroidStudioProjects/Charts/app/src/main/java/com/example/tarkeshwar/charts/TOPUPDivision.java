package com.example.tarkeshwar.charts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;


import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by tarkeshwar on 17/1/17.
 */

public class TOPUPDivision extends AppCompatActivity {
    private String url="http://192.168.0.109:8080/BHT/GraphDivisionFS";
    private String dataFromServer;
    private ObjectMapper mapper;
    private GetSetGraphDivisionFS getSetGraphDivisionFS;
    /*GraphDivisionFS
[["0",0],["Barisal",184],["Chittagong",1040],["Comilla",263],["Dhaka",3813],["Dinajpur",253],["Gopalgunj",0],["khulna",231],["Kushtia",112],["Nohakali",188],["Rajshahi",334],["Rangpur",580],["Sylhet",168],["Tangail",190]] */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {

            dataFromServer= new GetJSON().execute(url).get();
            System.out.println("Downloaded data from Server - "+dataFromServer);
            mapper=new ObjectMapper();
            getSetGraphDivisionFS = mapper.readValue(dataFromServer, GetSetGraphDivisionFS.class);
            System.out.println("Getter Setter Done - "+getSetGraphDivisionFS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //setContentView(R.layout.top_up_division);
        LineChart lineChart = new LineChart(this);
        lineChart.animateXY(2000,2000);
        lineChart.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(lineChart);
                // creating list of entry
                ArrayList<Entry> entries = new ArrayList<>();
                entries.add(new Entry(4f, 0));
                entries.add(new Entry(8f, 1));
                entries.add(new Entry(6f, 2));
                entries.add(new Entry(2f, 3));
                entries.add(new Entry(18f, 4));
                entries.add(new Entry(9f, 5));
        LineDataSet dataset = new LineDataSet(entries, "# of Calls");
        dataset.setDrawCubic(true);
        ArrayList<String> labels = new ArrayList<String>();
                labels.add("January");
                labels.add("February");
                labels.add("March");
                labels.add("April");
                labels.add("May");
                labels.add("June");
        LineData data = new LineData(labels, dataset);
       lineChart.setData(data);
       lineChart.setDescription("Description");;
    }
}
