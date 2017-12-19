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

public class GraphDivisionFS extends AppCompatActivity {
    private String url="http://192.168.0.109:8080/BHT/GraphDivisionFS";
    private String dataFromServer;
    private ObjectMapper mapper;
    private GetSetGraphDivisionFS getSetGraphDivisionFS;
    /*GraphDivisionFS
    * [["0",0],["Barisal",184],["Chittagong",1040],["Comilla",263],["Dhaka",3813],["Dinajpur",253],["Gopalgunj",0],["khulna",231],["Kushtia",112],["Nohakali",188],["Rajshahi",334],["Rangpur",580],["Sylhet",168],["Tangail",190]] */
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
