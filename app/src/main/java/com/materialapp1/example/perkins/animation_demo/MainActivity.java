package com.materialapp1.example.perkins.animation_demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    // Animation
    private Animation animRotate1;

    private ImageView myView;

    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hold on t
        myView = (ImageView)findViewById(R.id.imageView);
        but = (Button)findViewById(R.id.button);
        // load the animation
        animRotate1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);

        //set listener (VERY IMPORTANT, YOU FORGET nothing works!)
        animRotate1.setAnimationListener(this);
    }

    public void doAnimate(View view) {
        animateit();
//        but.startAnimation(animRotate1);
    }

    public void doAnimate1(View view) {
        animateit();
    }

    private void animateit() {
        myView.startAnimation(animRotate1);
    }


    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
