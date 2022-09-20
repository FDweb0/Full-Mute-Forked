package com.full.mute.ad.block.spotify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static com.full.mute.ad.block.spotify.MainActivity.closeSwitch;
import static com.full.mute.ad.block.spotify.NotificationService.ACTION_STOP;

public class StopServiceBroadcastReceiver extends BroadcastReceiver {

    public static boolean shouldCloseService = false;

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getStringExtra("Action");
        if (action.equals(ACTION_STOP)) {
            closeSwitch();
            shouldCloseService = true;
        }
        Log.d("Receiver", "RECEIVED BROADCAST");

//        Intent bringAppToForeground = new Intent(context, MainActivity.class);
//        bringAppToForeground.setAction(Intent.ACTION_MAIN);
//        bringAppToForeground.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        bringAppToForeground.addCategory(Intent.CATEGORY_LAUNCHER);
//        context.startActivity(bringAppToForeground);
    }

}
