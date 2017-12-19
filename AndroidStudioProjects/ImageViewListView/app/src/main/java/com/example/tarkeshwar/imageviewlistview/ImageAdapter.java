package com.example.tarkeshwar.imageviewlistview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Created by tarkeshwar on 3/1/17.
 */
public class ImageAdapter  extends ArrayAdapter<String> {
    private String[] imageURLArray;

    private LayoutInflater inflater;
    public ImageAdapter(Context context, int textViewResourceId, String[] imageArray) {

        super(context, textViewResourceId, imageArray);

        inflater = ((Activity)context).getLayoutInflater();

        imageURLArray = imageArray;

    }

    public ImageAdapter(Context context, int resource) {
        super(context, resource);
    }

    public ImageAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

      public ImageAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public ImageAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    public ImageAdapter(Context context, int resource, int textViewResourceId, List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }

    private static class ViewHolder {

        ImageView imageView;

    }

   @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;

        if(convertView == null) {

            convertView = inflater.inflate(R.layout.imageitem, null);

            viewHolder = new ViewHolder();

            viewHolder.imageView = (ImageView)convertView.findViewById(R.id.testImage);

            convertView.setTag(viewHolder);

        }

        viewHolder = (ViewHolder)convertView.getTag();

        Bitmap imageBitmap = null;

        try {

            URL imageURL = new URL(imageURLArray[position]);

            imageBitmap = BitmapFactory.decodeStream(imageURL.openStream());

            viewHolder.imageView.setImageBitmap(imageBitmap);

        } catch (IOException e) {

            Log.e("error", "Downloading Image Failed");

            viewHolder.imageView.setImageResource(R.drawable.postthumb_loading);

        }

        return convertView;

    }
}
