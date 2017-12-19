package com.example.tarkeshwar.charts;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by tarkeshwar on 18/1/17.
 */

public class GetJSON extends AsyncTask<String, Void, String> {
    static String output = null;
    private BufferedReader buffer;

    @Override
    protected String doInBackground(String... params) {
        for (String url : params) {
            output = getOutputFromUrl(url);
            System.out.println("**************Data Found During Asyntask*******:::::  " + output);
        }
        return output;

    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    private String getOutputFromUrl(String url) {
        StringBuffer output = new StringBuffer("");
        try {
            InputStream stream = getHttpConnection(url);
            if (stream == null) {
                System.out.println("Stream found null");
                return "No Data";
            }

            System.out.println("***********Connection is OK****************");
            buffer = new BufferedReader(new InputStreamReader(stream));
            System.out.println("*******************After Buffered Reader********************");
            String s = "";
            while ((s = buffer.readLine()) != null)
                output.append(s);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return output.toString();
    }

    private InputStream getHttpConnection(String url) {
        InputStream stream = null;

        try {
            URL urls = new URL(url);
            System.out.println("**************I am inside the getHttpconnection Method**************");
            URLConnection connection = urls.openConnection();
            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            httpConnection.setRequestMethod("GET");

            httpConnection.connect();
            System.out.println("Responce Code - " + httpConnection.getResponseCode());
            if (httpConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                stream = httpConnection.getInputStream();
                System.out.println("**************I am at getHttpconnection Method**************");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return stream;
    }
}

