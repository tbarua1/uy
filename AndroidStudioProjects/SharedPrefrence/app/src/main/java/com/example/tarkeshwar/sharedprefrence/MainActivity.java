package com.example.tarkeshwar.sharedprefrence;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private SharedPreferences pre;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 pre= getSharedPreferences("Data",MODE_PRIVATE);
                String name = pre.getString("name", null);
               // Toast.makeText(MainActivity.this,"Name - "+name,Toast.LENGTH_LONG).show();
                if(name==null) {
                    SharedPreferences.Editor editor=     pre.edit();
                    editor.putString("name", "Mr. Xyz");
                    editor.commit();
                    Toast.makeText(MainActivity.this, "Name - " + name, Toast.LENGTH_LONG).show();
                }  else{


                        Toast.makeText(MainActivity.this,"Name - "+name,Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
