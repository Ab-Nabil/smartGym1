package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewExercises extends AppCompatActivity {
    int image_id;
    String name;
    TextView timer,title;
    Button btnStart;
    ImageView detailed_image;
    boolean isRunning=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_exercises);

        timer=(TextView)findViewById(R.id.timer);
        title=(TextView)findViewById(R.id.title);
        detailed_image=(ImageView)findViewById(R.id.detailed_image);
        btnStart=findViewById(R.id.btnStart);
        if(getIntent()!=null)
        {
            this.image_id=getIntent().getIntExtra("image_id",-1);
            this.name=getIntent().getStringExtra("name");
            detailed_image.setImageResource(image_id);
            title.setText(name);
        }

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isRunning)
                {
                    btnStart.setText("Done");
                    new CountDownTimer(20000,1000)
                    {
                        @Override
                        public void onTick(long i) {
                            timer.setText(""+i/1000);
                        }

                        @Override
                        public void onFinish() {
                            //put adds here
                            Toast.makeText(ViewExercises.this,"Finish!!",Toast.LENGTH_SHORT).show();
                            finish();
                        }

                    }.start();
                }
                else
                {
                    Toast.makeText(ViewExercises.this,"Finish!!! ", Toast.LENGTH_SHORT).show();
                    finish();
                }

                isRunning=!isRunning;

            }
        });
    }
}