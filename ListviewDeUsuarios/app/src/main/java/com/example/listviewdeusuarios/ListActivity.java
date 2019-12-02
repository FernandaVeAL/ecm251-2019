package com.example.listviewdeusuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import models.UserInfo;

public class ListActivity extends AppCompatActivity {
    List<UserInfo> userList;

    @BindView(R.id.listViewUser)
    protected ListView listViewUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        Intent veioDeOutraTela = getIntent();
        Bundle bundle =  veioDeOutraTela.
                getExtras();

        userList = (ArrayList) bundle.getSerializable("LISTA_USUARIOS");
        ArrayAdapter<UserInfo> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, userList);
        listViewUsers.setAdapter(adapter);
    }
}


