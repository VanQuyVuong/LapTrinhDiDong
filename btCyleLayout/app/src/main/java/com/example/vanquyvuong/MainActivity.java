package com.example.vanquyvuong;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private List<FoodItem> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewFood);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        foodList = new ArrayList<>();

        foodList.add(new FoodItem("Gà quay",
                "Gà quay lá mắt ật, hạt é",
                Arrays.asList(
                        new ImageItem(R.drawable.img_1_1),
                        new ImageItem(R.drawable.img_1_2),
                        new ImageItem(R.drawable.img_1_3),
                        new ImageItem(R.drawable.img_1_4),
                        new ImageItem(R.drawable.img_1_5)
                )));

        foodList.add(new FoodItem("Cơm chiên dương châu",
                "Cơm chiên dương châu",
                Arrays.asList(
                        new ImageItem(R.drawable.img_2_1),
                        new ImageItem(R.drawable.img_2_2),
                        new ImageItem(R.drawable.img_2_3),
                        new ImageItem(R.drawable.img_2_4)
                )));

        foodList.add(new FoodItem("BeefSteak",
                "BeefSteak tươi ngon",
                Arrays.asList(
                        new ImageItem(R.drawable.img_3_1),
                        new ImageItem(R.drawable.img_3_2),
                        new ImageItem(R.drawable.img_3_3),
                        new ImageItem(R.drawable.img_3_4)
                )));

        foodList.add(new FoodItem("Canh chua cá ",
                "Canh chú cá basa",
                Arrays.asList(
                        new ImageItem(R.drawable.img_4),
                        new ImageItem(R.drawable.img_4_2),
                        new ImageItem(R.drawable.img_4_3)
                )));

        foodList.add(new FoodItem("Cá quả chien xù",
                "Cá quả",
                Arrays.asList(
                        new ImageItem(R.drawable.img_5)
                )));

        foodList.add(new FoodItem("Thịt thỏ xào lăn",
                "Thịt thỏ dai thơm , ngọt thịt",
                Arrays.asList(
                        new ImageItem(R.drawable.img_6)
                )));

        foodList.add(new FoodItem("Giò heo giả cầy",
                "Giò heo giả cầy truyền thống Việt Nam",
                Arrays.asList(
                        new ImageItem(R.drawable.img_7)
                )));

        adapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);
    }
}
