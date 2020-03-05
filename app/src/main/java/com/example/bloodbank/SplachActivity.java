package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.WindowManager;

import android.os.Bundle;
import android.os.Handler;

public class SplachActivity extends AppCompatActivity {

    LauncherManger launcherManger;
   private static int SPLASH_SCREEN_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);

        launcherManger = new LauncherManger(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(launcherManger.isFirstTime()){
                    launcherManger.setFirstLunch(false);
                    startActivity(new Intent(getApplicationContext(),SliderActivity.class));
                }else {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));

                }

            }
        },SPLASH_SCREEN_TIME_OUT);



    }
}
