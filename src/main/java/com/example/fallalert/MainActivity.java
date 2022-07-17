package com.example.fallalert;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goTonotif(View view){
        startActivity(new Intent(MainActivity.this, Notifications.class));

    }
    public void goToHistroy(View view){
        startActivity(new Intent(MainActivity.this, History.class));

    }
    public void goToFaq(View view){
        startActivity(new Intent(MainActivity.this, Faq.class));
    }

    public void goToSos(View view){
        startActivity(new Intent(MainActivity.this, SOS.class));
    }

}