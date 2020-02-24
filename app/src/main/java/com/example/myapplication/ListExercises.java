package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListExercises extends AppCompatActivity {
    List<Exercises> exerciseList=new ArrayList<>();
    RecyclerView.LayoutManager LayoutManager;
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercises);

        recyclerView=findViewById(R.id.list_ex);
        adapter=new RecyclerViewAdapter(exerciseList,getBaseContext());
        LayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(LayoutManager);
        recyclerView.setAdapter(adapter);
        initData();
    }

    private void initData() {
        exerciseList.add(new Exercises(R.drawable.easy_pose,"Easy Pose"));
        exerciseList.add(new Exercises(R.drawable.cobra_pose,"Cobra Pose"));
        exerciseList.add(new Exercises(R.drawable.downward_facing_dog,"downward_facing_dog"));
        exerciseList.add(new Exercises(R.drawable.boat_pose,"boat_pose"));
        exerciseList.add(new Exercises(R.drawable.half_pigeon,"half_pigeon"));
        exerciseList.add(new Exercises(R.drawable.low_lunge,"low_lunge"));

        exerciseList.add(new Exercises(R.drawable.upward_bow,"upward_bow"));
        exerciseList.add(new Exercises(R.drawable.crescent_lunge,"crescent_lunge"));
        exerciseList.add(new Exercises(R.drawable.warrior_pose,"warrior_pose"));
        exerciseList.add(new Exercises(R.drawable.bow_pose,"bow_pose"));
        exerciseList.add(new Exercises(R.drawable.warrior_pose_2,"warrior_pose_2"));
    }
}
