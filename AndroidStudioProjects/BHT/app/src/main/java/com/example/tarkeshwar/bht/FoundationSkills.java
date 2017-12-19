package com.example.tarkeshwar.bht;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

/**
 * Created by tarkeshwar on 16/1/17.
 */

public class FoundationSkills extends AppCompatActivity {
    float values[]={300,400,100,500};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foundation_skills);
        LinearLayout linear=(LinearLayout) findViewById(R.id.foundation_skills);
        values=calculateData(values);
        linear.addView(new MyGraphview(this,values));
    }
    private float[] calculateData(float[] data) {
        // TODO Auto-generated method stub
        float total=0;
        for(int i=0;i<data.length;i++)
        {
            total+=data[i];
        }
        for(int i=0;i<data.length;i++)
        {
            data[i]=360*(data[i]/total);
        }
        return data;

    }
}
