package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class OnboardingActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper,viewFlipper2;
    Button next,skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        viewFlipper2=(ViewFlipper)findViewById(R.id.viewFlipper2);
        viewFlipper=(ViewFlipper)findViewById(R.id.viewFlipper);
        next=(Button)findViewById(R.id.next);
        skip=(Button)findViewById(R.id.skip);

        next.setOnClickListener(this);
        skip.setOnClickListener(this);

    }

    @Override
public void onClick(View v)
    {
            if (v == next) {
                viewFlipper.showNext();
                viewFlipper2.showNext();
            } else if (v == skip) {
                Intent intent = new Intent(OnboardingActivity.this, welcomeActivity.class);
                startActivity(intent);
            }
    }
}
