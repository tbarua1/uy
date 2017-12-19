package com.example.tarkeshwar.listview;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by tarkeshwar on 27/12/16.
 */

public class SimpleListView extends Activity {
    String[] numbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Activity Started");
        setContentView(R.layout.simple_listview);
        System.out.println("View Set and Fixed");
        ListView listView = (ListView) findViewById(R.id.simple_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, numbers);

        System.out.println("Array Adapter Created");


        System.out.println("View Find from List View ");
        listView.setAdapter(adapter);
        System.out.println("Adapter Set");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SimpleListView.this,"Clicked Item is "+numbers[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
