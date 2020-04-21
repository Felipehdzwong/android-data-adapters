package com.example.dataadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dataadapter.model.Student;
import com.example.dataadapter.viewholder.StudentViewHolder;

import java.util.ArrayList;
import java.util.List;

public class StudentRecyclerAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private Context context;
    private int layoutResource ;
    private List<Student> studentList;

    public StudentRecyclerAdapter(Context context,  int layoutResource, ArrayList<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
        this.layoutResource = layoutResource;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // creates the 'ViewHolder' to be used for the whole list
        View view = LayoutInflater.from(context).inflate(layoutResource, parent, false);
        return  new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        // allows to fill in the row widget with actual data
        holder.bindData(position, studentList.get(position));
    }

    @Override
    public int getItemCount() {
        // sets up the amount of elements to display on the list
        return studentList.size();
    }
}
