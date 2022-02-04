package com.digdroid.alman.dig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoStart extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C2219c3 k = C2219c3.m9805k(context.getApplicationContext());
        k.mo8152A("retroarch_running", false);
        if (!C2185a4.m9692v(context) && k.mo8180c("autostart", false)) {
            Intent intent2 = new Intent(context, MainActivity.class);
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        }
    }
}
