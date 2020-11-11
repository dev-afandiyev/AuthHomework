package com.example.homeworkauth.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.homeworkauth.R;
import com.example.homeworkauth.ui.users.Person;
import java.util.List;

public class RecVAdapter extends RecyclerView.Adapter<RecVAdapter.ViewHolder> {
    List<Person> personList;

    public RecVAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @NonNull
    @Override
    public RecVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecVAdapter.ViewHolder holder, int i) {
        holder.personAge.setText(personList.get(i).age);
        holder.personName.setText(personList.get(i).name);
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personAge;
        public ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personAge = (TextView) itemView.findViewById(R.id.person_age);
        }
    }

}