package com.example.tarkeshwar.savedinstance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int count=0;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.get_counter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Counter - ",Toast.LENGTH_LONG).show();
                count++;
            }
        });
    }
on

    @Override
    protected void onPause() {Gokil
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
