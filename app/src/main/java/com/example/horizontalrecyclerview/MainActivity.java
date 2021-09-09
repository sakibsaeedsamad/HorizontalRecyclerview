package com.example.horizontalrecyclerview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List studentDataList = new ArrayList<>();
    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        studentAdapter = new StudentAdapter(studentDataList,MainActivity.this);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(studentAdapter);
        StudentDataPrepare();
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void StudentDataPrepare() {
        studentData data = new studentData("David", 25);
        studentDataList.add(data);
        data = new studentData("Angelina", 25);
        studentDataList.add(data);
        data = new studentData("Rambo", 20);
        studentDataList.add(data);
        data = new studentData("Rocky", 28);
        studentDataList.add(data);
        data = new studentData("Walker", 15);
        studentDataList.add(data);
        data = new studentData("Paul", 19);
        studentDataList.add(data);
        data = new studentData("Rock", 52);
        studentDataList.add(data);
        data = new studentData("Jhon", 30);
        studentDataList.add(data);
        data = new studentData("Chena", 28);
        studentDataList.add(data);
//        Collections.sort(studentDataList, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//
//        });
    }
}