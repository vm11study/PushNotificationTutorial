package com.example.pushnotificationtutorial;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

import androidx.annotation.RequiresApi;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

@SuppressLint({"OverrideAbstract", "NewApi"})
public class FirebaseService extends NotificationListenerService
{
    private static final String TAG = "FirebaseMessagingServic";
    @Override
    public void onCreate ()
    {
        Log.d(TAG,"enter FirebaseService.");
        super.onCreate();
        Log.d(TAG,"onCreate @" + getClass ());
    }

    @Override
    public void onNotificationPosted (StatusBarNotification sbn)
    {
        super.onNotificationPosted (sbn);
        Log.d(TAG,"onNotificationPosted [" + getApplicationContext ().getPackageName () + "][" + sbn.getPackageName () + "] @" + getClass ());

        try
        {
            if (getApplicationContext ().getPackageName ().equals (sbn.getPackageName ()))
            {
                // (여기선 스킵요) NotificationListenerService 상속 클래스는 권한 획등용.
                // 푸시 알림 수신 관련 처리는 FirebaseMessagingService 상속된 클래스의 onMessageReceived 쪽에서 처리함
            }
        } catch (Exception e) { e.printStackTrace (); }
    }
}
