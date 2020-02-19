package com.twigsoftwares.alveo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NavigatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigated);
        TextView textView = findViewById(R.id.hellowordtext);
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            String key = extras.getString("key");
            textView.setText(key);
        }
    }
}
