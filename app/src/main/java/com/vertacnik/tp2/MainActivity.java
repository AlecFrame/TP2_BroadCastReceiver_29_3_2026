package com.vertacnik.tp2;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private DesbloqueoReceiver desbloqueo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        desbloqueo = new DesbloqueoReceiver();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        registerReceiver(desbloqueo, new IntentFilter("android.intent.action.USER_PRESENT"));
        super.onResume();
    }
}