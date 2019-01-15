package com.thesep.tronghoa.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecycleView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        studentList = new ArrayList<>();
        studentList.add(new Student("Dat","Hue"));
        studentList.add(new Student("Bao","Quang Tri"));
        studentList.add(new Student("Thuan","Hue"));
        studentList.add(new Student("Tho","Hue"));
        studentList.add(new Student("Phuc","Hue"));
        studentList.add(new Student("Duc","Hue"));
        mAdapter = new CustomAdapter(this,studentList);
        recyclerView.setAdapter(mAdapter);
    }
}
