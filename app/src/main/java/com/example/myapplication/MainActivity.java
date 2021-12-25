package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationManager nm;
    static int id=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ServiceCast")
    public void add(View view) {
        NotificationCompat.Builder nb=new NotificationCompat.Builder(this).setContentTitle("Danger").
                setContentText("the remaining is running now")
                .setSmallIcon(R.drawable.kurapika);
        nm=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(id, nb.build());
        id++;
    }

    public void remove(View view) {
        nm.cancelAll();
    }
}