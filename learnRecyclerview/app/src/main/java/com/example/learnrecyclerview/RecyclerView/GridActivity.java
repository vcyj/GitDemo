package com.example.learnrecyclerview.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.learnrecyclerview.R;

public class GridActivity extends AppCompatActivity {
    private RecyclerView Rvgrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        Rvgrid=findViewById(R.id.rv_layout_grid);
        Rvgrid.setLayoutManager(new GridLayoutManager(GridActivity.this,3));
        Rvgrid.setAdapter(new GridAdapter(GridActivity.this, new GridAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(GridActivity.this,"click"+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}