package com.youngstudio.api_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Page3Fragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<String> datas = new ArrayList<>();
    Page3Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page3, container, false);

        datas.add("aaa");
        datas.add("aaa");
        datas.add("aaa");
        datas.add("aaa");

        recyclerView = view.findViewById(R.id.recyclerview);
        adapter = new Page3Adapter(datas, getActivity());
        recyclerView.setAdapter(adapter);


        return view;
    }


}