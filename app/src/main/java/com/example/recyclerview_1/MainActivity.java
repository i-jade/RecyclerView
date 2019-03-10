package com.example.recyclerview_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_id)
    TextView textId;
    private LinearLayoutManager layoutManager;
    private MainAdapter mAdapter;
    private List<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

        RecyclerView mRecyclerview = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerview.setLayoutManager(layoutManager);
        mAdapter = new MainAdapter(this,mDatas);
        mRecyclerview.setAdapter(mAdapter);
    }

    private void initData() {
        mDatas = new ArrayList<>();
        for(int i='A' ; i < 'Z';i++){
            mDatas.add(""+(char)(i));
        }
    }
}
