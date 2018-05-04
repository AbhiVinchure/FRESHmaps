package com.example.srikar.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.srikar.freshmaps.R;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.button);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextName = (EditText) findViewById(R.id.RoomNumber);

                String str = editTextName.getText().toString();

                Intent startIntent = new Intent(getApplicationContext(), Map.class);
                startIntent.putExtra("room", str);
                startActivity(startIntent);
            }
        });
    }
}
