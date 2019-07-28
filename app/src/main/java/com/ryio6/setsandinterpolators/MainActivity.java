package com.ryio6.setsandinterpolators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      mImageView =  findViewById(R.id.dummyImage);
    }

    public void interpolatorEg(View view) {

        Animation tvAnim = AnimationUtils.loadAnimation(this, R.anim.interpolator_anim);
        mImageView.startAnimation(tvAnim);


    }
}
