package com.example.tarkeshwar.spinnertest;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private Spinner students;
    private Button btn;
    private  double longitude,latitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students = (Spinner) findViewById(R.id.spinner1);
        btn = (Button) findViewById(R.id.btnSubmit);
        List<String> list = new ArrayList<String>();
        list.add("Eleven");
        list.add("Twelve");
        list.add("Thirteen");
        list.add("Fourteen");
        list.add("Fifteen");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);

        students.setAdapter(dataAdapter);
        students.setOnItemSelectedListener(this);
        btn.setOnClickListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(),
                "OnItemSelectedListener : " + parent.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(parent.getContext(), "Nothing is Selected Yet", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
    LocationListener locationListener = new LocationListener() {
            public void onLocationChanged(Location location) {
                longitude = location.getLongitude();
                latitude = location.getLatitude();
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {
Toast.makeText(MainActivity.this,"GPS Disabled",Toast.LENGTH_LONG).show();
            }
        };
lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,1000,0,locationListener);
        Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    longitude = location.getLongitude();
     latitude = location.getLatitude();
Toast.makeText(MainActivity.this,"Latitude : "+latitude+" Longitude : "+longitude,Toast.LENGTH_LONG).show();
        System.out.println("Latitude : "+latitude+" Longitude : "+longitude);
    }
}
