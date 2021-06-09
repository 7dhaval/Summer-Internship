package com.dreamproject.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        MediaPlayer mediaPlayer =
                                   MediaPlayer.create(getApplicationContext(),R.raw.fireboy);
        mediaPlayer.start();

         imageView = findViewById(R.id.kill);
         animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);

         imageView.startAnimation(animation);

         animation.setAnimationListener(new Animation.AnimationListener() {
             @Override
             public void onAnimationStart(Animation animation) {

             }

             @Override
             public void onAnimationEnd(Animation animation) {
                 Intent intent = new Intent(getApplicationContext(), Welcome.class);
                 startActivity(intent);
                 finish();
             }


             @Override
             public void onAnimationRepeat(Animation animation) {

             }

         });

    }

}