package com.example.tarkeshwar.imageviewlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] imageURLArray = new String[]{

            "http://farm8.staticflickr.com/7315/9046944633_881f24c4fa_s.jpg",
            "http://farm4.staticflickr.com/3777/9049174610_bf51be8a07_s.jpg",
            "http://farm8.staticflickr.com/7324/9046946887_d96a28376c_s.jpg",
            "http://farm3.staticflickr.com/2828/9046946983_923887b17d_s.jpg",
            "http://farm4.staticflickr.com/3810/9046947167_3a51fffa0b_s.jpg",
            "http://farm4.staticflickr.com/3773/9049175264_b0ea30fa75_s.jpg",
            "http://farm4.staticflickr.com/3781/9046945893_f27db35c7e_s.jpg",
            "http://farm6.staticflickr.com/5344/9049177018_4621cb63db_s.jpg",
            "http://farm8.staticflickr.com/7307/9046947621_67e0394f7b_s.jpg",
            "http://farm6.staticflickr.com/5457/9046948185_3be564ac10_s.jpg",
            "http://farm4.staticflickr.com/3752/9046946459_a41fbfe614_s.jpg",
            "http://farm8.staticflickr.com/7403/9046946715_85f13b91e5_s.jpg",
            "http://farm8.staticflickr.com/7315/9046944633_881f24c4fa_s.jpg",
            "http://farm4.staticflickr.com/3777/9049174610_bf51be8a07_s.jpg",
            "http://farm8.staticflickr.com/7324/9046946887_d96a28376c_s.jpg",
            "http://farm3.staticflickr.com/2828/9046946983_923887b17d_s.jpg",
            "http://farm4.staticflickr.com/3810/9046947167_3a51fffa0b_s.jpg",
            "http://farm4.staticflickr.com/3773/9049175264_b0ea30fa75_s.jpg",
            "http://farm4.staticflickr.com/3781/9046945893_f27db35c7e_s.jpg",
            "http://farm6.staticflickr.com/5344/9049177018_4621cb63db_s.jpg",
            "http://farm8.staticflickr.com/7307/9046947621_67e0394f7b_s.jpg",
            "http://farm6.staticflickr.com/5457/9046948185_3be564ac10_s.jpg",
            "http://farm4.staticflickr.com/3752/9046946459_a41fbfe614_s.jpg",
            "http://farm8.staticflickr.com/7403/9046946715_85f13b91e5_s.jpg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)this.findViewById(R.id.listView);

         ImageAdapter imageAdapter = new ImageAdapter(this, R.layout.imageitem, imageURLArray);
        listView.setAdapter(imageAdapter);
    }
    }
}
