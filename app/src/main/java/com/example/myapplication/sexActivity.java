package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class sexActivity extends AppCompatActivity {
    private ImageView  iv;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sex);


    }

    public void nclick(View view) {
        Intent myintent =new Intent(this,weightActivity.class);
        startActivity(myintent);
        iv=findViewById(R.id.n1);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
