package com.main.smoothhorizontalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.main.smoothrecyclerview.SmoothRecyclerLayoutManager;
import com.main.smoothrecyclerview.SmoothRecyclerView;

import recycler.coverflow.CoverFlowLayoutManger;
import recycler.coverflow.RecyclerCoverFlow;

public class MainActivity extends AppCompatActivity implements Adapter.onItemClick {

    private SmoothRecyclerView smoothRecyclerView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        textView = findViewById(R.id.idx);
        smoothRecyclerView = findViewById(R.id.rview);
        smoothRecyclerView.setAdapter(new Adapter(this,this));
        smoothRecyclerView.setOnItemSelectedListener(new SmoothRecyclerLayoutManager.OnSelected() {
            @Override
            public void onItemSelected(int position) {
                textView.setText((position +1) + "/" + smoothRecyclerView.getLayoutManager().getItemCount());

            }
        });
    }

    @Override
    public void clickItem(int pos) {
        smoothRecyclerView.smoothScrollToPosition(pos);
    }
}
