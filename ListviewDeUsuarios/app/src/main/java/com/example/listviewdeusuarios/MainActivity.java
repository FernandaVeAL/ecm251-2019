package com.example.listviewdeusuarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import models.UserInfo;

public class MainActivity extends AppCompatActivity {

    private List<UserInfo> myUsersinfo;

    @BindView(R.id.btnEnterList)
    protected Button btnEnterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myUsersinfo = new ArrayList<>();

        ButterKnife.bind(this);
    }
    @OnClick(R.id.btnEnterList)
    public void enviarLista(){
        Intent intent = new Intent(this, ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("LISTA_USUARIOS", (Serializable) myUsersinfo);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
