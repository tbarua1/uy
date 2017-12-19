package com.example.tarkeshwar.charts;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * Created by tarkeshwar on 18/1/17.
 */

public class GraphPlacement extends AppCompatActivity {
    private String url="http://192.168.0.109:8080/BHT/PlacementServlet";
    private String dataFromServer;
    private ObjectMapper mapper;
    private GetSetPlacementGraph getSetPlacementGraph;
    /*PlacementServlet
{"ites":346,"topup":422} */
    //{"ites":346,"topup":422}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {

            dataFromServer= new GetJSON().execute(url).get();
            System.out.println("Downloaded data from Server - "+dataFromServer);
            mapper=new ObjectMapper();
            getSetPlacementGraph = mapper.readValue(dataFromServer, GetSetPlacementGraph.class);
            System.out.println("Getter Setter Done - "+getSetPlacementGraph);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PieChart pieChart = new PieChart(this);
       // pieChart.setBackgroundColor(ColorTemplate.COLORFUL_COLORS);
        pieChart.setHoleColorTransparent(false);

        pieChart.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(pieChart);

        ArrayList<Entry> entries = new ArrayList();
        entries.add(new Entry(getSetPlacementGraph.getTOPUP(), 0));
     entries.add(new Entry(getSetPlacementGraph.getITES(), 1));

        PieDataSet dataset = new PieDataSet(entries,"No C");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("GraphTopup");
        labels.add("ITES Foundation Skills");

        PieData data = new PieData(labels, dataset);
        pieChart.setData(data);
        pieChart.setDescription("Description");
    }
}
