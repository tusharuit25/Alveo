package com.twigsoftwares.alveo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    TextView textView;
    Context context;

    AppCompatActivity appCompatActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        textView = findViewById(R.id.textView);
        context = getApplicationContext();
        appCompatActivity = MenuActivity.this;
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu,view,menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.color_menu,menu);
        menu.setHeaderTitle("Select Color for textview");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }
    @Override
    public boolean onContextItemSelected(MenuItem item)
    {

        switch(item.getItemId()) {
            case R.id.red_item:
                // do your code
                textView.setTextColor(getResources().getColor(R.color.red));
                return true;
            case R.id.blue_item:
                // do your code
                textView.setTextColor(getResources().getColor(R.color.blue));
                return true;
            case R.id.green_item:
                // do your code
                textView.setTextColor(getResources().getColor(R.color.green));
                return true;
            case R.id.clear_item:
                // do your code
                textView.setTextColor(getResources().getColor(R.color.black));
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.search_item:
                // do your code
                Toast.makeText(this, "Search Item Selected...", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.upload_item:
                // do your code
                return true;
            case R.id.copy_item:
                // do your code
                return true;
            case R.id.print_item:
                // do your code
                return true;
            case R.id.share_item:
                // do your code
                return true;
            case R.id.bookmark_item:
                // do your code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
