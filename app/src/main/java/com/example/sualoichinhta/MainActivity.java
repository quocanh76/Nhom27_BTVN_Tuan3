package com.example.sualoichinhta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText hsGui;
    private EditText gvNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        hsGui = findViewById(R.id.hsInput);
        gvNhan = findViewById(R.id.gvOutput);

        Button nopbaibtn = findViewById(R.id.btnGotoSecond);

        nopbaibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                myIntent.putExtra("hs", hsGui.getText().toString());
                startActivityForResult(myIntent,99);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==99 && resultCode==88)
        {
            String gv = data.getStringExtra("gv");
            gvNhan.setText(gv);
        }
    }
}