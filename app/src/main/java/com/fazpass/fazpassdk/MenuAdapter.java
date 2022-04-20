package com.fazpass.fazpassdk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Anvarisy on 4/20/2022.
 * fazpass
 * anvarisy@fazpass.com
 */
public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private ArrayList<String> fazpassMenu;

    public MenuAdapter(ArrayList<String> fazpassMenu) {
        this.fazpassMenu = fazpassMenu;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fazpass_menu_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvMenuItem.setText(fazpassMenu.get(position));
    }

    @Override
    public int getItemCount() {
        return fazpassMenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvMenuItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMenuItem = itemView.findViewById(R.id.tvFeatureItem);
        }
    }
}
