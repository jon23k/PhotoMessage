package edu.rosehulman.photomessage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by jony on 7/5/16.
 */
public class NotificationBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = intent.getParcelableExtra(MainActivity.KEY_NOTIFICATION);
        int id = intent.getIntExtra(MainActivity.KEY_SOON_NOTIFICATION_ID, 0);
        notificationManager.notify(id, notification);
    }
}