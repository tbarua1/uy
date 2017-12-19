package com.example.tarkeshwar.myfirstandroidapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
private EditText firstName, lastName, yourName;
private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = (EditText) findViewById(R.id.first_name);
        lastName = (EditText) findViewById(R.id.last_name);
        yourName = (EditText) findViewById(R.id.your_name);
        submit= (Button) findViewById(R.id.display_data);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Toast.makeText(MainActivity.this,firstName.getText().toString()+" "+lastName.getText().toString(),
                        Toast.LENGTH_LONG).show();*/
               yourName.setText(firstName.getText().toString()+" "+lastName.getText().toString());
            }
        });
    }
}
