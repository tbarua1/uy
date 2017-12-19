package com.example.tarkeshwar.appcontrol;

import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RemoteRequestEV3 ev3;
    private RegulatedMotor left, right;
    private Button connect;
    private MediaStore.Audio audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button left = (Button) findViewById(R.id.left);
        Button right = (Button) findViewById(R.id.right);
        Button stop = (Button) findViewById(R.id.stop);
        Button forward = (Button) findViewById(R.id.forward);
        Button backward = (Button) findViewById(R.id.backward);
        connect = (Button) findViewById(R.id.connect);
        left.setOnClickListener(this);
        right.setOnClickListener(this);
        stop.setOnClickListener(this);
        forward.setOnClickListener(this);
        backward.setOnClickListener(this);
        connect.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.left) new Control().execute("rotate left");
        else if (v.getId() == R.id.right) new Control().execute("rotate right");
        else if (v.getId() == R.id.stop) new Control().execute("stop");
        else if (v.getId() == R.id.forward) new Control().execute("forward");
        else if (v.getId() == R.id.backward) new Control().execute("backward");
        else if (v.getId() == R.id.connect) {
            if (ev3 == null) {
                new Control().execute("connect","192.168.0.9");
                connect.setText("Disconnect");
            }
            else {
                new Control().execute("disconnect");
                connect.setText("Connect");
            }
        }
    }
    private class Control extends AsyncTask<String, Integer, Long> {

        protected Long doInBackground(String... cmd) {

            if (cmd[0].equals("connect")) {
                try {
                    ev3 = new RemoteRequestEV3(cmd[1]);
                    left = ev3.createRegulatedMotor("A", 'L');
                    right = ev3.createRegulatedMotor("B", 'L');
                    audio = ev3.getAudio();
                    audio.systemSound(3);
                    return 0l;
                } catch (IOException e) {
                    return 1l;
                }
            } else if (cmd[0].equals("disconnect") && ev3 != null) {
                audio.systemSound(2);
                left.close();
                right.close();
                ev3.disConnect();
                ev3 = null;
                return 0l;
            }

            if (ev3 == null) return 2l;

            ev3.getAudio().systemSound(1);

            if (cmd[0].equals("stop")) {
                left.stop(true);
                right.stop(true);
            } else if (cmd[0].equals("forward")) {
                left.forward();
                right.forward();
            } else if (cmd[0].equals("backward")) {
                left.backward();
                right.backward();
            } else if (cmd[0].equals("rotate left")) {
                left.backward();
                right.forward();
            } else if (cmd[0].equals("rotate right")) {
                left.forward();
                right.backward();
            }

            return 0l;
        }

        protected void onPostExecute(Long result) {
            if (result == 1l) Toast.makeText(MainActivity.this, "Could not connect to EV3", Toast.LENGTH_LONG).show();
            else if (result == 2l) Toast.makeText(MainActivity.this, "Not connected", Toast.LENGTH_LONG).show();
        }
    }
}
