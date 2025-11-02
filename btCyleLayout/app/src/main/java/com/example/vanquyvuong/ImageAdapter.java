package com.example.vanquyvuong;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private List<ImageItem> imageList;

    public ImageAdapter(List<ImageItem> imageList) {
        this.imageList = imageList;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView;

        public ImageViewHolder(View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.imgFood);
        }
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_image, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        holder.imgView.setImageResource(imageList.get(position).getImageResId());
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
