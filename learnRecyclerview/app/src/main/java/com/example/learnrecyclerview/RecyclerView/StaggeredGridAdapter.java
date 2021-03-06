package com.example.learnrecyclerview.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learnrecyclerview.R;

public class StaggeredGridAdapter extends RecyclerView.Adapter <StaggeredGridAdapter.LinearViewHolder>{
    private Context mcontext;
    private OnItemClickListener mlistener;
    public StaggeredGridAdapter(Context context, OnItemClickListener listener){
        this.mcontext=context;
        this.mlistener=listener;

    }
    @NonNull
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.item1_pu,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredGridAdapter.LinearViewHolder holder, final int position) {
        holder.iv.setImageResource(R.drawable.a);
        holder.textView.setText("hor you know");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView iv;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=(TextView) itemView.findViewById(R.id.tv_linear);
            iv=(ImageView) itemView.findViewById(R.id.iv1);
        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
