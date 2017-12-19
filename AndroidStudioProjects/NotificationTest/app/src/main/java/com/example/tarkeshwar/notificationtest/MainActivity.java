package com.example.tarkeshwar.notificationtest;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
    private boolean notificationActive = false;
    private NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNotification(View view) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(R.drawable.architecture);
        builder.setContentTitle("Test Notification");
        builder.setContentText("Wel Come To Notification");
        builder.setTicker("New Message Alert");
        //explicity intent to start activity
        Intent intent = new Intent(this, SecondClass.class);
        //StackBuilder , back stack machenism  artificially
        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(this);
        taskStackBuilder.addParentStack(SecondClass.class);
        taskStackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent = taskStackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, builder.build());
        notificationActive = true;

    }

    public void stopNotification(View view) {
        if (notificationActive) {
            notificationManager.cancel(0);
        }
    }
    public void setAlarm(View view){
        long timeInMillis = new GregorianCalendar().getTimeInMillis()+5*1000;
        Intent intent = new Intent(this, AlarmReceiver.class);
       AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,timeInMillis,PendingIntent.getBroadcast(this,1,intent,PendingIntent.FLAG_UPDATE_CURRENT));


    }
}
