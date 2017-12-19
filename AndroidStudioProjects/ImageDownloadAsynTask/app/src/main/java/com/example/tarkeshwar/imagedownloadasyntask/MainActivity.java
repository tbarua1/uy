package com.example.tarkeshwar.imagedownloadasyntask;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView myFirstImage = (ImageView) findViewById(R.id.myFirstImage);
        ImageView mySecondImage = (ImageView) findViewById(R.id.mySecondImage);
        ImageView myThirdImage = (ImageView) findViewById(R.id.myThirdImage);
        String URL1 = "http://www.google.com/logos/2013/estonia_independence_day_2013-1057005.3-hp.jpg";
        String URL2 = "http://www.google.com/logos/2013/park_su-geuns_birthday-1055005-hp.jpg";
        String URL3 = "http://www.google.com/logos/2013/anne_cath_vestlys_93rd_birthday-1035005-hp.jpg";


        myFirstImage.setTag(URL1);
        mySecondImage.setTag(URL2);
        myThirdImage.setTag(URL3);


        new DownloadImageTask.execute(myFirstImage);
        new DownloadImageTask.execute(mySecondImage);
        new DownloadImageTask.execute(myThirdImage);
    }

    public class DownloadImageTask extends AsyncTask<ImageView, Void, Bitmap> {
        ImageView imageView = null;

        @Override
        protected Bitmap doInBackground(ImageView... params) {
            this.imageView = params[0];
            return download_Image(imageView.getTag());

        }

        @Override
        protected void onPostExecute(Bitmap result) {
            imageView.setImageBitmap(result);
        }

        private Bitmap download_Image(String url) {

            Bitmap bmp = null;
            try {
                URL ulrn = new URL(url);
                HttpURLConnection con = (HttpURLConnection) ulrn.openConnection();
                InputStream is = con.getInputStream();
                bmp = BitmapFactory.decodeStream(is);
                if (null != bmp)
                    return bmp;

            } catch (Exception e) {
            }
            return bmp;
        }
    }
    public Bitmap downloadImage(String src){
        try {
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream inputStream = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(inputStream);
            return  myBitmap;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
