package com.youngstudio.api_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Page2Fragment extends Fragment {

    EditText et,et2;
    RecyclerView recyclerView;
    Page3Adapter adapter;

    TextView tv;

    double lat1,lng1;
    ArrayList<String> items= new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page2, container, false);

        items.add("aaa");
        items.add("aaa");

        et= view.findViewById(R.id.et);
        et2= view.findViewById(R.id.et2);
        tv= view.findViewById(R.id.tv);

        recyclerView = view.findViewById(R.id.recyclerview);
        adapter = new Page3Adapter(items, getActivity());
        recyclerView.setAdapter(adapter);



        return view;
    }

    public void clickBtn(View view) {
//        startActivity(new Intent(this, SecondActivity.class));
//        Intent intent=new Intent(this,Main2Activity.class);
//        startActivity(intent);

        //지도 앱 실행

//        Intent intent3= new Intent();
//        intent3.setAction("medi");
//        startActivity(intent3);
    }


}//onCreateView




























