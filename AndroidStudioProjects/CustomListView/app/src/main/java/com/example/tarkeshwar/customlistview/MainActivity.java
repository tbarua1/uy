package com.example.tarkeshwar.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView);

        // Create and populate a List of planet names.
        String[] numbers = new String[]  {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        ArrayList<String> numbersList = new ArrayList<String>();
       numbersList.addAll( Arrays.asList(numbers) );

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow,R.id.rowTextView,numbersList);

        // Add more planets. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
        listAdapter.add( "Eleven" );
        listAdapter.add( "Twelve" );
        listAdapter.add( "Thirteen" );
        listAdapter.add( "Fourteen" );
        listAdapter.add( "Fifteen" );

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );
    }
}
