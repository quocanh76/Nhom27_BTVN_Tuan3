package com.example.sualoichinhta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private EditText gvSua;
    private Button btnSuabai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        gvSua = findViewById(R.id.dvReceived);
        btnSuabai = findViewById(R.id.btnSuabai);

        Intent myIntent = getIntent();
        String hs = myIntent.getStringExtra("hs");
        gvSua.setText(hs);

        btnSuabai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myIntent.putExtra("gv", gvSua.getText().toString());
                setResult(88, myIntent);
                finish();
            }
        });


    }



}
