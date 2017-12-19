package com.example.tarkeshwar.audiouriplayer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    Sensor accelerometer;
    SensorManager sensorManager;
    TextView data;
    Button btn;
    Uri myUri;
    MediaPlayer mediaPlayer;
boolean start=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
        data = (TextView) findViewById(R.id.accelleration);
        btn = (Button) findViewById(R.id.music_play);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myUri = Uri.parse("http://192.168.0.150:8080/TestHibernate/song.mp3"); // initialize Uri here
                mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

                try {
                    mediaPlayer.setDataSource(getApplicationContext(), myUri);
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(!start){
                mediaPlayer.start();
                start = true;
                btn.setText("Play Local Uri Song");}
                else{
                    mediaPlayer.stop();
                    start = false;
                    btn.setText("Stopped Local Uri Song");
                }
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        data.setText(event.values[0] + " " + event.values[1] + " " + event.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
