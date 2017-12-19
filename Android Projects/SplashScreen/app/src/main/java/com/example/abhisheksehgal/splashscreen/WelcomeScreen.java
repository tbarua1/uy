package com.example.abhisheksehgal.splashscreen;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Abhishek.Sehgal on 06-12-2017.
 */

public class WelcomeScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        ActionBar actionBar = getActionBar();


        // Enabling Back navigation on Action Bar icon
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
        // return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.navigation_home) {
            //Do something
            return true;
        } else if (id == R.id.navigation_dashboard) {
            //Do something
            return true;
        } else if (id == R.id.navigation_notifications) {
            //Do something
            return true;
        }

        return super.onOptionsItemSelected(item);   // return super.onOptionsItemSelected(item);
    }

}
