package com.example.homeworkauth.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.homeworkauth.R;
import com.example.homeworkauth.ui.adapter.RecVAdapter;
import com.example.homeworkauth.ui.users.Person;
import java.util.List;

public class UserList extends AppCompatActivity {
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_list_rv);
        setRvParam();
        addAdapter();

    }

    private void setRvParam() {
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(lm);
    }

    private void addAdapter() {
        List<Person> personList = new Person().initializeData();
        RecVAdapter adapter = new RecVAdapter(personList);
        rv.setAdapter(adapter);
    }

}

