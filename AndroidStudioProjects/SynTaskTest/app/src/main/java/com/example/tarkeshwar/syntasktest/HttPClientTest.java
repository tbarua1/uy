package com.example.tarkeshwar.syntasktest;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLOutput;

/**
 * Created by tarkeshwar on 1/1/17.
 */

public class HttPClientTest {
  private Context ctx;
    public HttPClientTest(Context ctx) {
        this.ctx=ctx;
    }
    public void connectTo(String Url){
        String data;
        try {
            URL url=new URL(Url);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
            while ((data=br.readLine())!=null){
                System.out.println(data);
            }
            br.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
