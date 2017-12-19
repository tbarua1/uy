package com.example.tarkeshwar.bht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button topUP, fS, topUPDevision, itestFSFinal, division, itessFSDivision, placements, topUPFinal;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topUP = (Button) findViewById(R.id.top_up);
        fS = (Button) findViewById(R.id.foundation_skills);
        topUPDevision = (Button) findViewById(R.id.top_up_division);
        itestFSFinal = (Button) findViewById(R.id.ites_fs_final);
        division = (Button) findViewById(R.id.division);
        itessFSDivision = (Button) findViewById(R.id.ites_fs_division);
        placements = (Button) findViewById(R.id.placements);
        topUPFinal = (Button) findViewById(R.id.top_up_final);
        topUP.setOnClickListener(this);
        fS.setOnClickListener(this);
        topUPDevision.setOnClickListener(this);
        itestFSFinal.setOnClickListener(this);
        division.setOnClickListener(this);
        itessFSDivision.setOnClickListener(this);
        placements.setOnClickListener(this);
        topUPFinal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top_up:
                intent=new Intent(MainActivity.this,TOPUP.class);
                startActivity(intent);
                break;
            case R.id.foundation_skills:
                intent=new Intent(MainActivity.this,TOPUP.class);
                startActivity(intent);
                break;
            case R.id.top_up_division:
                intent=new Intent(MainActivity.this,TOPUP.class);
                startActivity(intent);
                break;
            case R.id.ites_fs_final:
                intent=new Intent(MainActivity.this,TOPUP.class);
                startActivity(intent);
                break;
            case R.id.division:
                intent=new Intent(MainActivity.this,TOPUP.class);
                startActivity(intent);
                break;
            case R.id.ites_fs_division:
                intent=new Intent(MainActivity.this,TOPUP.class);
                startActivity(intent);
                break;
            case R.id.placements:
                intent=new Intent(MainActivity.this,TOPUP.class);
                startActivity(intent);
                break;
            case R.id.top_up_final:
                intent=new Intent(MainActivity.this,TOPUP.class);
                startActivity(intent);
                break;

        }
    }
}
