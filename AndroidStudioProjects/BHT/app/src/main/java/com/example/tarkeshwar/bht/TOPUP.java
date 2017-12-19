package com.example.tarkeshwar.bht;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by tarkeshwar on 16/1/17.
 */

public class TOPUP extends AppCompatActivity {
    private TextView txtinfo;
    LinearLayout lvOne, lvTwo, lvThree, lvFour, lvFive, lvparent;
    TextView txtOne, txtTwo, txtThree, txtFour, txtFive;
    Button btnundo, btnsave;
    PieView pieView;
    Uri outputFileUri;
    OutputStream outStream = null;
    String[] petNames = new String[] { "Dogs", "Cats", "Fish", "Rabbits",
            "Roddents" };
    int[] percentage = new int[] { 55, 25, 10, 5, 5 };
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.topup_pie);
        txtinfo = (TextView) findViewById(R.id.txtinfo);
        pieView = (PieView) findViewById(R.id.pie_view);

        lvOne = (LinearLayout) findViewById(R.id.lvOne);
        lvTwo = (LinearLayout) findViewById(R.id.lvTwo);
        lvThree = (LinearLayout) findViewById(R.id.lvThree);
        lvFour = (LinearLayout) findViewById(R.id.lvFour);
        lvFive = (LinearLayout) findViewById(R.id.lvFive);
        lvparent = (LinearLayout) findViewById(R.id.lvparent);

        txtOne = (TextView) findViewById(R.id.txtOne);
        txtTwo = (TextView) findViewById(R.id.txtTwo);
        txtThree = (TextView) findViewById(R.id.txtThree);
        txtFour = (TextView) findViewById(R.id.txtFour);
        txtFive = (TextView) findViewById(R.id.txtFive);

        btnundo = (Button) findViewById(R.id.btnundo);
        btnsave = (Button) findViewById(R.id.btnsave);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveImage();
            }
        });
        btnundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pieView.removeSelectedPie();
                txtinfo.setText("Pet ownership details");
            }
        });
        set(pieView);
    }
    public void SaveImage() {
        lvparent.buildDrawingCache();
        Bitmap bm = lvparent.getDrawingCache();

        try {
            File root = new File(Environment.getExternalStorageDirectory()
                    + File.separator + "PieChartsExample" + File.separator);
            root.mkdirs();
            File sdImageMainDirectory = new File(root, "piechart.jpg");
            outputFileUri = Uri.fromFile(sdImageMainDirectory);
            outStream = new FileOutputStream(sdImageMainDirectory);
        } catch (Exception e) {
            Toast.makeText(this, "Error occured. Please try again later.",
                    Toast.LENGTH_SHORT).show();
        }

        try {
            bm.compress(Bitmap.CompressFormat.PNG, 100, outStream);
            outStream.flush();
            outStream.close();
            Toast.makeText(this, "Created successfully!", Toast.LENGTH_SHORT)
                    .show();
        } catch (Exception e) {
        }
    }
    private void set(PieView pieView) {
        ArrayList<PieHelper> pieHelperArrayList = new ArrayList<PieHelper>();

        int color0 = Color.rgb(0, 128, 255);
        int color1 = Color.rgb(252, 3, 71);
        int color2 = Color.rgb(117, 91, 4);
        int color3 = Color.rgb(3, 7, 173);
        int color4 = Color.rgb(20, 156, 82);

        pieHelperArrayList.add(new PieHelper(55, color0));
        pieHelperArrayList.add(new PieHelper(25, color1));

        pieHelperArrayList.add(new PieHelper(10, color2));

        pieHelperArrayList.add(new PieHelper(5, color3));

        pieHelperArrayList.add(new PieHelper(5, color4));

        lvOne.setBackgroundColor(color0);
        txtOne.setText(petNames[0].toString());
        lvTwo.setBackgroundColor(color1);
        txtTwo.setText(petNames[1]);
        lvThree.setBackgroundColor(color2);
        txtThree.setText(petNames[2]);
        lvFour.setBackgroundColor(color3);
        txtFour.setText(petNames[3]);
        lvFive.setBackgroundColor(color4);
        txtFive.setText(petNames[4]);

        pieView.setDate(pieHelperArrayList);
        pieView.setOnPieClickListener(new PieView.OnPieClickListener() {
            @Override
            public void onPieClick(int index) {
                if (index != PieView.NO_SELECTED_INDEX) {
                    txtinfo.setText(percentage[index] + "% owns "
                            + petNames[index] + ".");
                } else {
                    txtinfo.setText("No selected pie");
                }
            }
        });
    }
}
