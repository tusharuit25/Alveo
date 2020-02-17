package com.twigsoftwares.alveo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EventActivity extends AppCompatActivity {

    Button deletebutton,editbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        deletebutton = findViewById(R.id.deletebutton);
        editbutton = findViewById(R.id.editbutton);

        Event event = new Event(EventActivity.this);
        deletebutton.setOnClickListener(event);
        editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EventActivity.this, "Edited successfully...", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void SaveButtonClick(View v)
    {
        Toast.makeText(EventActivity.this, "Saved successfully...", Toast.LENGTH_SHORT).show();
    }

}

class Event implements View.OnClickListener {
    Activity activity;

    public Event(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(activity, "Deleted successfully...", Toast.LENGTH_SHORT).show();

    }
}