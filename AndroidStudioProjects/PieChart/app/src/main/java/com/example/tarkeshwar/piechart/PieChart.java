package com.example.tarkeshwar.piechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by tarkeshwar on 16/1/17.
 */
public class PieChart extends Drawable implements View.OnTouchListener {
    private Context context;
    private View view;
    private int[] data_values, color_values;
    private String[] data_names;
    private Paint paint;
    private RectF arc_bounds;
private int value_sum=0,padding_bottom=0;
    private float left_edge,
    top_edge,
    right_edge,
    bottom_edge;
    public PieChart(Context c, View v, String[] data_names, int[] data_values, int[] color_values) {
        context = c;
        view = v;
        this.data_values = data_values;
        this.color_values = color_values;
        this.data_names = data_names;

        paint = new Paint();
        view.setOnTouchListener(this);
    }

    @Override
    public void draw(Canvas canvas) {
        int view_w = view.getWidth();
        int view_h = view.getHeight();

        //chart area rectangle

       arc_bounds = new RectF(
                left_edge,
                top_edge,
                right_edge,
                bottom_edge
        );

        //sum of data values
        for (int datum : data_values)
            value_sum += datum;

        float startAngle = 0;
        int i = 0;
        for (int datum : data_values) {
            if (datum == 0) continue;

            //calculate start & end angle for each data value
            float endAngle = value_sum == 0 ? 0 : 360 * datum / (float) value_sum;
            float newStartAngle = startAngle + endAngle;


            int flickr_pink = color_values[i % color_values.length];
            paint.setColor(flickr_pink);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(0.5f);

            //gradient fill color
            LinearGradient linearGradient = new LinearGradient(arc_bounds.left, arc_bounds.top, arc_bounds.right, arc_bounds.bottom, flickr_pink, Color.WHITE, Shader.TileMode.CLAMP);
            paint.setShader(linearGradient);

            //draw fill arc
            canvas.drawArc(arc_bounds, startAngle, endAngle, true, paint);

            Paint linePaint = new Paint();
            linePaint.setAntiAlias(true);
            linePaint.setStyle(Paint.Style.STROKE);
            linePaint.setStrokeJoin(Paint.Join.ROUND);
            linePaint.setStrokeCap(Paint.Cap.ROUND);
            linePaint.setStrokeWidth(0.5f);
            linePaint.setColor(Color.BLACK);

            //draw border arc
            canvas.drawArc(arc_bounds, startAngle, endAngle, true, linePaint);
            int barStartX = 50;
            int barWidth = 20;
            int barStartY = view_h-padding_bottom+(i-1)*2*barWidth;

            Rect barRect = new Rect(barStartX,barStartY,barStartX+barWidth,barStartY+barWidth);

            //draw legend box
            canvas.drawRect(barRect, paint);
            canvas.drawRect(barRect,linePaint);


            Paint textPaint = new Paint();
            textPaint.setAntiAlias(true);
            textPaint.setColor(Color.WHITE);
            textPaint.setTextSize(30);

            //draw legend text
            canvas.drawText(data_names[i], barStartX+2*barWidth, barStartY+barWidth, textPaint);

            startAngle = newStartAngle;
            i++;

        }
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return PixelFormat.UNKNOWN;
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            double clickAngle;

            //relative x & y position
            float xPos = event.getX() - arc_bounds.centerX();
            float yPos = event.getY() - arc_bounds.centerY();

            //calcuate the click angle
            clickAngle = Math.atan2(yPos, xPos) * 180 / Math.PI;

            if (clickAngle < 0)
                clickAngle = 360 + clickAngle;

            float startAngle = 0;
            int itemIndex = 0;
            for (int datum : data_values) {
                if (datum == 0) continue;

                float endAngle = value_sum == 0 ? 0 : 360 * datum / (float) value_sum;
                float newStartAngle = startAngle + endAngle;

                //check the condition of start angle & end angle of data item.
                if (arc_bounds.contains(event.getX(), event.getY()) && clickAngle > startAngle && clickAngle < newStartAngle) {

                    Toast.makeText(context, data_names[itemIndex] + "  is clicked!!", Toast.LENGTH_LONG).show();
                   // Log.d(TAG, "pie item is clicked-->" + data_names[itemIndex]);
                    break;
                }

                itemIndex++;
                startAngle = newStartAngle;

            }


        } return false;
    }
    }