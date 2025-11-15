package com.example.fragmentandviewpaper.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentandviewpaper.R;
import com.example.fragmentandviewpaper.adapter.AdapterFrag1;
import com.example.fragmentandviewpaper.model.MyItem;

import java.util.ArrayList;

public class Frag1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag1, container, false);

        RecyclerView recycler = v.findViewById(R.id.recyclerFrag1);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        ArrayList<MyItem> data = new ArrayList<>();
        for (int i = 1; i <= 20; i++)
            data.add(new MyItem("Frag1 - Item " + i));

        recycler.setAdapter(new AdapterFrag1(data));

        return v;
    }
}
