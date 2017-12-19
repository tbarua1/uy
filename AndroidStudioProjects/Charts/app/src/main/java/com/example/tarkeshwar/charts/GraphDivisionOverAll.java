package com.example.tarkeshwar.charts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Created by tarkeshwar on 21/1/17.
 */

public class GraphDivisionOverAll extends AppCompatActivity {
    private String url="http://192.168.0.109:8080/BHT/GraphDivisionOverAll";
    private String dataFromServer;
    private ObjectMapper mapper;
    private GetSetGraphDivisionFS getSetGraphDivisionFS;
    /*GraphDivisionOverAll
[["0",0],["Barisal",225],["Chittagong",1292],["Comilla",274],["Dhaka",6642],["Dinajpur",303],["Gopalgunj",0],["Jessore",40],["khulna",315],["Kushtia",267],["Nohakali",221],["Rajshahi",526],["Rangpur",600],["Sylhet",242],["Tangail",240]] */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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
    }
}
