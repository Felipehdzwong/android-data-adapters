package com.example.dataadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
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
        StudentAdapter adapter = new StudentAdapter(this, arrayOfStudents);
        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.lv_students);
        listView.setAdapter(adapter);
    }
}
