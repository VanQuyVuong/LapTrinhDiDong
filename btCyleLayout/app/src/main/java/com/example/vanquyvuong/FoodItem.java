package com.example.vanquyvuong;

import java.util.List;

public class FoodItem {
    private String name;
    private String description;
    private List<ImageItem> imageList;

    public FoodItem(String name, String description, List<ImageItem> imageList) {
        this.name = name;
        this.description = description;
        this.imageList = imageList;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public List<ImageItem> getImageList() { return imageList; }
}
