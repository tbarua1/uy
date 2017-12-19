package com.example.tarkeshwar.opennewactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by tarkeshwar on 27/12/16.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
String data=extras.getString("data");
       String data1= extras.getString("data1");
        /*String data = intent.getStringExtra("data");
*/
        System.out.println(data+" "+data1);
        Toast.makeText(SecondActivity.this,data+" "+data1,Toast.LENGTH_LONG).show();
    }
}
