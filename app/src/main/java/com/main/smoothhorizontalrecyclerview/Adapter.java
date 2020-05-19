package com.main.smoothhorizontalrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context mContext;
    private int[] mItems= {R.mipmap.item1,R.mipmap.item2,R.mipmap.item3,R.mipmap.item4,R.mipmap.item5,R.mipmap.item6};
    private onItemClick clickCb;

    public Adapter(Context c) {
        this.mContext = c;
    }

    public Adapter(Context c, onItemClick cb) {
        this.mContext = c;
        this.clickCb = cb;
    }

    public void setClickLsn(onItemClick clickCb) {
        this.clickCb = clickCb;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mContext).load(mItems[position%mItems.length]).into(holder.img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCb != null){
                    clickCb.clickItem(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
        }
    }
    interface onItemClick {
        void clickItem(int pos);
    }
}
