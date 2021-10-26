package com.example.pushnotificationtutorial;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class PushNotificationService extends FirebaseMessagingService {
    private static final String TAG = "FirebaseMessagingServic";



    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {


        super.onMessageReceived(remoteMessage);
        if(remoteMessage.getData().size()>0) {
            Log.d(TAG, "result :  " + remoteMessage.getData());
        }
        if(remoteMessage.getNotification()!=null)
        {
//            String title = remoteMessage.getNotification().getTitle();
//            Toast myToast2 = Toast.makeText(this.getApplicationContext(),"", Toast.LENGTH_SHORT);
//            myToast2.show();
//            Log.d(TAG,title);
        }
    }

    @Override
    public void onDeletedMessages() {
        super.onDeletedMessages();
    }


}
