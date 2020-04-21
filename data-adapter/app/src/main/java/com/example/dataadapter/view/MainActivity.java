package com.example.dataadapter.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.ListView;

import com.example.dataadapter.R;
import com.example.dataadapter.adapter.StudentRecyclerAdapter;
import com.example.dataadapter.model.Student;
import com.example.dataadapter.adapter.StudentAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateStudentList();
    }

    private void populateStudentList() {
        // Construct the data source
        ArrayList<Student> arrayOfStudents = Student.getUsers();
        // Create the adapter to convert the array to views
                    //StudentAdapter adapter = new StudentAdapter(this, arrayOfStudents);// Code using regular adapter
        final StudentRecyclerAdapter adapter = new StudentRecyclerAdapter(this, R.layout.item_student, arrayOfStudents);

        //widget
        RecyclerView recyclerView = findViewById(R.id.rv_students);

        // Attach the adapter to a ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        // recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        // recyclerView.setLayoutManager(new GridLayoutManager(this, 3, LinearLayoutManager.HORIZONTAL, false));
        // recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        recyclerView.setAdapter(adapter);



//        listView.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "Text", Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}