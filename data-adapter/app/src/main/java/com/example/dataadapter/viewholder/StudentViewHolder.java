package com.example.dataadapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dataadapter.R;
import com.example.dataadapter.model.Student;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private ImageView picture;
    private TextView tvName;
    private TextView tvCountry;

    public StudentViewHolder(@NonNull View itemView){
        super(itemView);
        this.picture = itemView.findViewById(R.id.img_profile_picture);
        this.tvName = itemView.findViewById(R.id.tv_name);
        this.tvCountry = itemView.findViewById(R.id.tv_country);
    }

    public void bindData(final int position, final Student student) {
        picture.setImageResource(getDrawableResultByPosition(position));
        tvName.setText(student.getName());
        tvCountry.setText(student.getCountry());

        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), student.getName()+ " is in position " + position + ".", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int getDrawableResultByPosition(int position) {
        if (((position+1) % 2) == 0){
          return R.drawable.ic_image_placeholder;
        }
        return R.drawable.ic_mood_black_24dp;
    }
}
