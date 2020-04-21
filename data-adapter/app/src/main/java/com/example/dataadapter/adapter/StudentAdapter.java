package com.example.dataadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dataadapter.R;
import com.example.dataadapter.model.Student;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {

    public StudentAdapter(@NonNull Context context, ArrayList<Student> resource) {
        super(context, 0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_student, parent, false);
        }

        // Get the data item for this position
        Student student = getItem(position);

        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
        TextView tvCountry = (TextView) convertView.findViewById(R.id.tv_country);
        // Populate the data into the template view using the data object
        tvName.setText(student.getName());
        tvCountry.setText(student.getCountry());
        // Return the completed view to render on screen
        return convertView;
    }
}
