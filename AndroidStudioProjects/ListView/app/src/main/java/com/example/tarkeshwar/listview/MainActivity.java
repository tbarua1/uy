package com.example.tarkeshwar.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3, btn4, btn5;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.show_list_simple);
        btn2 = (Button) findViewById(R.id.show_list_simple1);
        btn3 = (Button) findViewById(R.id.show_list_simple2);
        btn4 = (Button) findViewById(R.id.show_list_simple3);
        btn5 = (Button) findViewById(R.id.show_list_simple4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.show_list_simple:
                intent=new Intent(getApplicationContext(),SimpleListView.class);
                startActivity(intent);
                break;
            case R.id.show_list_simple1:
                Toast.makeText(MainActivity.this,"Second Button Clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.show_list_simple2:
                Toast.makeText(MainActivity.this,"Third Button Clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.show_list_simple3:
                Toast.makeText(MainActivity.this,"Fourth Button Clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.show_list_simple4:
                Toast.makeText(MainActivity.this,"Second Button Clicked",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
