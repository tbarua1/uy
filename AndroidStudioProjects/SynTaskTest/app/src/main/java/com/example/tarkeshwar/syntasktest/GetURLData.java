package com.example.tarkeshwar.syntasktest;

import android.os.AsyncTask;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by tarkeshwar on 31/12/16.
 */

public class GetURLData extends AsyncTask {
    String urlString="http://clover.studio/2016/08/09/getting-current-location-in-android-using-location-manager/";
    @Override
    protected Object doInBackground(Object[] params) {
        try {
            URL url=new URL(urlString);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection= (HttpURLConnection) urlConnection;
            connection.setRequestMethod("GET");
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            if(inputStream!=null){
                BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
                String s="";
                while((s = reader.readLine()).length()>0){
                    System.out.println(s);


                }

            }
            else{
                System.out.println("Null Input Streqm");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
