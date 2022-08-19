package com.host900.lanass;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import android.os.Build;
import android.os.PowerManager;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

import androidx.annotation.RequiresApi;


public class NeNotificationService01 extends NotificationListenerService {

    //当收到一条消息的时候回调，sbn是收到的消息
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {

    }

    //当移除一条消息的时候回调，sbn是被移除的消息
    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        NotificationChannel channel = new NotificationChannel("id","name", NotificationManager.IMPORTANCE_LOW);

        NotificationManager manager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        manager.createNotificationChannel(channel);

        Notification.Builder builder= new Notification.Builder(this,"id");
        builder.setContentTitle("LanASS 内网穿透客户端");
        builder.setContentText("服务保持中，不要移除此通知！");
        builder.setAutoCancel(false);
        builder.setSmallIcon(R.mipmap.ic_launcher);

        Notification notification = builder.build();
        startForeground(110, notification);
    }

}
