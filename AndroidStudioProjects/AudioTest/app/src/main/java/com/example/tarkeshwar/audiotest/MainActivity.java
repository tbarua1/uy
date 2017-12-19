package com.example.tarkeshwar.audiotest;

import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MediaPlayer mediaPlayer;
    private boolean start = true;
    private Button btnStartLocal;
    private int length = 0;
    private Uri myUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStartLocal = (Button) findViewById(R.id.start_local);
        btnStartLocal.setOnClickListener(this);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        length = mediaPlayer.getDuration();
        mediaPlayer.start();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.ORIENTATION_LANDSCAPE == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(getBaseContext(), "You are at Landscape Mode", Toast.LENGTH_LONG).show();
        } else if (newConfig.ORIENTATION_PORTRAIT == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(getBaseContext(), "You are at Protrait Mode", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.start_local:

                if (start) {

                    mediaPlayer.pause();
                    start = false;
                    btnStartLocal.setText("Paused Local Raw Song");
                } else {

                    mediaPlayer.start();
                    start = true;
                    btnStartLocal.setText("Play Raw Song");
                }
                break;

        }
    }
}
