package com.example.tarkeshwar.webbrowsertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView browser;
    private String content = "<html>"
            + "  <head>"
            + "    <script type=\"text/javascript\" src=\"jsapi.js\"></script>"
            + "    <script type=\"text/javascript\">"
            + "      google.load(\"visualization\", \"1\", {packages:[\"corechart\"]});"
            + "      google.setOnLoadCallback(drawChart);"
            + "      function drawChart() {"
            + "        var data = google.visualization.arrayToDataTable(["
            + "          ['Year', 'Sales', 'Expenses'],"
            + "          ['2010',  1000,      400],"
            + "          ['2011',  1170,      460],"
            + "          ['2012',  660,       1120],"
            + "          ['2013',  1030,      540]"
            + "        ]);"
            + "        var options = {"
            + "          title: 'Truiton Performance',"
            + "          hAxis: {title: 'Year', titleTextStyle: {color: 'red'}}"
            + "        };"
            + "        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));"
            + "        chart.draw(data, options);"
            + "      }"
            + "    </script>"
            + "  </head>"
            + "  <body>"
            + "    <div id=\"chart_div\" style=\"width: 1000px; height: 500px;\"></div>"
            + "    <img style=\"padding: 0; margin: 0 0 0 330px; display: block;\" src=\"truiton.png\"/>"
            + "  </body>" + "</html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        browser = (WebView) findViewById(R.id.web_veiw);

        WebSettings settings = browser.getSettings();
        settings.setJavaScriptEnabled(true);
        browser.requestFocusFromTouch();
       browser.loadDataWithBaseURL("file://android_asset/", content, "text/html", "utf-8", null);
       // browser.loadUrl("http://google.com");
    }
}
