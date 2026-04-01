package com.vertacnik.tp2;

import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private DesbloqueoReceiver desbloqueo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        desbloqueo = new DesbloqueoReceiver();
        setContentView(R.layout.activity_main);

        if (checkSelfPermission(android.Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {

            requestPermissions(new String[]{android.Manifest.permission.CALL_PHONE}, 1);
        }
    }

    @Override
    protected void onResume() {
        registerReceiver(desbloqueo, new IntentFilter("android.intent.action.USER_PRESENT"));
        super.onResume();
    }

    @Override
    protected void onPause() {
        unregisterReceiver(desbloqueo);
        super.onPause();
    }
}