package com.youngstudio.api_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Page3Adapter extends RecyclerView.Adapter {

    ArrayList<String> datas;
    Context context;


    public Page3Adapter(ArrayList<String> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(context);

        View itemView= inflater.inflate(R.layout.item,parent,false);

        VH holder= new VH(itemView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH)holder;

        String s = datas.get(position);
        vh.tv.setText(s);

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class VH extends RecyclerView.ViewHolder{

        TextView tv;

        public VH(@NonNull View itemView) {
            super(itemView);
            tv= itemView.findViewById(R.id.tv);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    int position= getAdapterPosition();
                    Toast.makeText(context, position+""+datas.get(position), Toast.LENGTH_SHORT).show();

                }
            });


        }
    }
}
