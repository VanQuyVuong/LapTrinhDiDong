package com.example.vanquyvuong;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private List<FoodItem> foodList;

    public FoodAdapter(List<FoodItem> foodList) {
        this.foodList = foodList;
    }

    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtDesc;
        RecyclerView recyclerViewImages;

        public FoodViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtFoodName);
            txtDesc = itemView.findViewById(R.id.txtFoodDesc);
            recyclerViewImages = itemView.findViewById(R.id.recyclerViewImages);
        }
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, int position) {
        FoodItem item = foodList.get(position);
        holder.txtName.setText(item.getName());
        holder.txtDesc.setText(item.getDescription());

        // Adapter ngang cho ảnh
        holder.recyclerViewImages.setLayoutManager(
                new LinearLayoutManager(holder.itemView.getContext(), LinearLayoutManager.HORIZONTAL, false)
        );
        holder.recyclerViewImages.setAdapter(new ImageAdapter(item.getImageList()));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
