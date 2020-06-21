package com.example.learnrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.learnrecyclerview.RecyclerView.GridActivity;
import com.example.learnrecyclerview.RecyclerView.HorActivity;
import com.example.learnrecyclerview.RecyclerView.LinearRecyclerViewActivity;
import com.example.learnrecyclerview.RecyclerView.PuActivity;

public class MainActivity extends AppCompatActivity {
    private Button Btn_linear;
    private Button Btn_hor,Btn_grid,Btn_pu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn_linear=(Button) findViewById(R.id.rv_lis);
        Btn_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        Btn_hor=findViewById(R.id.rv_hro);
        Btn_hor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, HorActivity.class);
                startActivity(intent);
            }
        });
        Btn_grid=findViewById(R.id.rv_grid);
        Btn_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, GridActivity.class);
                startActivity(intent);
            }
        });
        Btn_pu=findViewById(R.id.rv_pu);
        Btn_pu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PuActivity.class);
                startActivity(intent);
            }
        });
    }
}