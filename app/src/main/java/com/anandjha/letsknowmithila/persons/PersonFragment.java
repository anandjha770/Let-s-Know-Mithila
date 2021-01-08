package com.anandjha.letsknowmithila.persons;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.anandjha.letsknowmithila.Adapters.PersonAdapter;
import com.anandjha.letsknowmithila.R;
import com.anandjha.letsknowmithila.models.PersonItemModel;

import java.util.ArrayList;

public class PersonFragment extends Fragment {

    private RecyclerView recyclerView;

    public PersonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<PersonItemModel> list = new ArrayList<>();
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        list.add(new PersonItemModel("Anand Jha","Handsome Boy"));
        PersonAdapter adapter = new PersonAdapter(list,getContext());
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_person, container, false);
        recyclerView = view.findViewById(R.id.item_recycler_view);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}