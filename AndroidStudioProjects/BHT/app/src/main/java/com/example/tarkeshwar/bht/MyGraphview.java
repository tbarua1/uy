package com.example.tarkeshwar.bht;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by tarkeshwar on 16/1/17.
 */

public class MyGraphview extends View {
    private Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    private float[] value_degree;
    private int[] COLORS={Color.BLUE,Color.GREEN,Color.GRAY,Color.CYAN,Color.RED};
    RectF rectf = new RectF (10, 10, 200, 200);
    int temp=0;

    public MyGraphview(Context context, float[] values) {

        super(context);
        value_degree=new float[values.length];
        for(int i=0;i<values.length;i++)
        {
            value_degree[i]=values[i];
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < value_degree.length; i++) {//values2.length; i++) {
            if (i == 0) {
                paint.setColor(COLORS[i]);
                canvas.drawArc(rectf, 0, value_degree[i], true, paint);
            }
            else
            {
                temp += (int) value_degree[i - 1];
                paint.setColor(COLORS[i]);
                canvas.drawArc(rectf, temp, value_degree[i], true, paint);
            }
        }
    }

    public MyGraphview(Context context) {
        super(context);
    }

    public MyGraphview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyGraphview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static void drawPieChart(Bitmap bmp, int[] colors, int[] slices){
        //canvas to draw on it
        Canvas canvas = new Canvas(bmp);
        RectF box = new RectF(2, 2,bmp.getWidth()-2 , bmp.getHeight()-2);

        //get value for 100%
        int sum = 0;
        for (int slice : slices) {
            sum += slice;
        }
        //initalize painter
        Paint paint = new Paint();
        paint.setAntiAlias(true);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1f);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        float start = 0;
        //draw slices
        for(int i =0; i < slices.length; i++){
            paint.setColor(colors[i]);
            float angle;
            angle = ((360.0f / sum) * slices[i]);
            canvas.drawArc(box, start, angle, true, paint);
            start += angle;
        }
    }
}
