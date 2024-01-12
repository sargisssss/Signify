package com.example.signify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder> {
    private List<CarouselItem> items;
    private Context context;

    public CarouselAdapter(List<CarouselItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public CarouselViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carousel_item, parent, false);
        return new CarouselViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarouselViewHolder holder, int position) {
        CarouselItem item = items.get(position);
        holder.imageView.setImageResource(item.getImageResource());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class CarouselViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public CarouselViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
