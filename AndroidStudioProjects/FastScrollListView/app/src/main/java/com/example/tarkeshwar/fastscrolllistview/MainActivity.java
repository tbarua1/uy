package com.example.tarkeshwar.fastscrolllistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView fruitView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruitView = (ListView) findViewById(android.R.id.list);

        fruitView.setFastScrollEnabled(true);
        String[] fruits = getResources().getStringArray(R.array.fruits_array);

        List<String> fruitList = Arrays.asList(fruits);
        Collections.sort(fruitList);
        fruitView.setAdapter(new ListAdapter(this, fruitList));

        fruitView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View arg1,
                                    int position, long arg3) {
                Toast.makeText(getApplicationContext(),
                        "" + parent.getItemAtPosition(position),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
