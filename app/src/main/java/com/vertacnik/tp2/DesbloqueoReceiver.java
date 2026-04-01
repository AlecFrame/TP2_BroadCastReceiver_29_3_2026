package com.vertacnik.tp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class DesbloqueoReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Pantalla desbloqueada detectada", Toast.LENGTH_LONG).show();
        Log.d("DesbloqueoReceiver", "Pantalla desbloqueada detectada");

        Intent call = new Intent(Intent.ACTION_CALL);
        call.setData(Uri.parse("tel:2664553747"));
        call.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(call);
    }


}