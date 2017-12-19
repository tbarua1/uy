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

public class GraphOverall extends AppCompatActivity {
    private String url="http://192.168.0.109:8080/BHT/GraphOverall";
    private String dataFromServer;
    private ObjectMapper mapper;
    private GetSetPlacementGraph getSetPlacementGraph;
    private GetSetGraphDivisionFS getSetGraphDivisionFS;
    /*GraphOverall
{"completed":5053,"ongoing":6134,"scheduled":0,"projected":0} */
    //{"completed":5053,"ongoing":6134,"scheduled":0,"projected":0}
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
