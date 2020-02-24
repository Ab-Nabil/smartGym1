package com.example.myapplication;

public class Exercises {
    public int Image_id;
    public String name;

    public Exercises(int image_id, String name) {
        this.Image_id = image_id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getImage_id() {
        return Image_id;
    }

    public void setImage_id(int image_id) {
        this.Image_id = image_id;
    }
}
