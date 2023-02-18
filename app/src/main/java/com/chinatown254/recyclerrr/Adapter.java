package com.chinatown254.recyclerrr;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<ModelClass> userList ;
    public Adapter(List<ModelClass> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design, parent ,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resourse = userList.get(position).getImageView1();
        String name = userList.get(position).getTextview1();
        String msg = userList.get(position).getTextview2();
        String time = userList.get(position).getTextview3();
        String line = userList.get(position).getDivider();

        holder.setData(resourse , name , msg , time , line);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView ;
        private TextView textview1 ;
        private TextView textview2 ;
        private TextView textview3 ;
        private TextView divider ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview1);
            textview1 = itemView.findViewById(R.id.textview1);
            textview2 = itemView.findViewById(R.id.textview2);
            textview3 = itemView.findViewById(R.id.textview3);
           divider = itemView.findViewById(R.id.divider);

        }

        public void setData(int resourse, String name, String msg, String time, String line) {
            imageView.setImageResource(resourse);
            textview1.setText(name);
            textview2.setText(msg);
            textview3.setText(time);
            divider.setText(line);
        }
    }
}
