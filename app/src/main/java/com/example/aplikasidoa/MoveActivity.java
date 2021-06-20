package com.example.aplikasidoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MoveActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_doa2, btn_doa3, btn_doa4, btn_doa5, btn_doa6, btn_doa7, btn_doa8, btn_doa9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_doa);

        Button btn_Doa1 = findViewById(R.id.btn_doa1);
        btn_Doa1.setOnClickListener(this);

        btn_doa2 = findViewById(R.id.btn_doa2);
        btn_doa3 = findViewById(R.id.btn_doa3);
        btn_doa4 = findViewById(R.id.btn_doa4);
        btn_doa5 = findViewById(R.id.btn_doa5);
        btn_doa6 = findViewById(R.id.btn_doa6);
        btn_doa7 = findViewById(R.id.btn_doa7);
        btn_doa8 = findViewById(R.id.btn_doa8);
        btn_doa9 = findViewById(R.id.btn_doa9);

        btn_doa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MoveActivity.this, DoaActivty2.class);
                startActivity(a);
            }
        });

        btn_doa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MoveActivity.this, DoaActivity3.class);
                startActivity(b);
            }
        });

        btn_doa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MoveActivity.this, DoaActivity4.class);
                startActivity(c);
            }
        });

        btn_doa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(MoveActivity.this, DoaActivity5.class);
                startActivity(d);
            }
        });

        btn_doa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MoveActivity.this, DoaActivity6.class);
                startActivity(e);
            }
        });

        btn_doa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(MoveActivity.this, DoaActivity7.class);
                startActivity(f);
            }
        });

        btn_doa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MoveActivity.this, DoaActivity8.class);
                startActivity(g);
            }
        });

        btn_doa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(MoveActivity.this, DoaActivity9.class);
                startActivity(h);
            }
        });
    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(),DoaActivity.class);
        startActivity(i);

    }
}