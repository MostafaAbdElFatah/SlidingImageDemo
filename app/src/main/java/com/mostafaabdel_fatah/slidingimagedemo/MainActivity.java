package com.mostafaabdel_fatah.slidingimagedemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView =(ImageView) findViewById(R.id.image);
        ( (AnimationDrawable) imageView.getBackground()).start();
        bg = (ImageView) findViewById(R.id.imagev);
    }


    public void Play_btnClicked(View view) {
        ( (AnimationDrawable) bg.getBackground()).start();
    }

    public void Stop_btnClicked(View view) {
        ( (AnimationDrawable) bg.getBackground()).stop();
    }

}
