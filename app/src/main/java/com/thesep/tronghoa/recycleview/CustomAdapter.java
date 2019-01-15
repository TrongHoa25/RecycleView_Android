package com.thesep.tronghoa.recycleview;

import android.content.Context;
import android.os.CpuUsageInfo;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{
    List<Student> studentList;
    Context context;


    public CustomAdapter(Context context,List<Student> studentList) {
        this.studentList = studentList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(studentList.get(position));
        Student std = studentList.get(position);
        holder.pName.setText(std.getName());
        holder.pDiaChi.setText(std.getDiachi());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{

        private TextView pName;
        private TextView pDiaChi;
        public ViewHolder(View itemView) {
            super(itemView);
            pName = itemView.findViewById(R.id.txt_tieude);
            pDiaChi = itemView.findViewById(R.id.txt_noidung);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Student student = (Student) v.getTag();
                    Toast.makeText(v.getContext(), "" + student.getName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
