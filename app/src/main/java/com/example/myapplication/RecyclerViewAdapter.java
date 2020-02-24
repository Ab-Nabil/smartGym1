package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>
{
    public ArrayList<Exercises> exerciseList;
    public Context context;

    public RecyclerViewAdapter(List<Exercises> exerciseList, Context context)
    {
        this.exerciseList= (ArrayList<Exercises>) exerciseList;
        this.context=context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_exercise,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder holder, int position) {
        holder.image.setImageResource(exerciseList.get(position).getImage_id());
        holder.text.setText(exerciseList.get(position).getName());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                //call to new activity
                //Toast.makeText(context,"Click to "+exerciseList.get(position).getName(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, ViewExercises.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                intent.putExtra("image_id", exerciseList.get(position).getImage_id());
                intent.putExtra("name", exerciseList.get(position).getName());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return exerciseList.size();
    }
}

class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{

    public ImageView image;
    public TextView text;
    public ItemClickListener itemClickListener;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        this.image=itemView.findViewById(R.id.ex_img);
        this.text=itemView.findViewById(R.id.ex_name);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onClick(v,getLayoutPosition());

    }
}
