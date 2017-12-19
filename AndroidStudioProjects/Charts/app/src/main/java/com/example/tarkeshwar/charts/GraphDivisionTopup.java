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

public class GraphDivisionTopup extends AppCompatActivity {
    private String url="http://192.168.0.109:8080/BHT/GraphDivisionTopup";
    private String dataFromServer;
    private ObjectMapper mapper;
    private GetSetGraphDivisionFS getSetGraphDivisionFS;
    /*GraphDivisionTopup
    * [["Barisal",41],["Chittagong",252],["Comilla",11],["Dhaka",2829],["Dinajpur",50],["Gopalgunj",0],["Jessore",40],["Khulna",84],["Kushtia",155],["Nohakali",33],["Rajshahi",192],["Rangpur",20],["Sylhet",74],["Tangail",50]]
*/
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
