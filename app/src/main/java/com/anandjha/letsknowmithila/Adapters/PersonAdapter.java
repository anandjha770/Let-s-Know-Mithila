package com.anandjha.letsknowmithila.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anandjha.letsknowmithila.R;
import com.anandjha.letsknowmithila.models.PersonItemModel;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.viewHolder>{

    ArrayList<PersonItemModel> list;
    Context context;

    public PersonAdapter(ArrayList<PersonItemModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.desc.setText(list.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView name,desc;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.list_item_name);
            desc = itemView.findViewById(R.id.description_textview);
        }
    }
}
