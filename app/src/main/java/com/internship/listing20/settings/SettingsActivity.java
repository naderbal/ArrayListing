package com.internship.listing20.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.internship.listing20.R;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        initToolbar();
        initListView();
    }
    /**
    * Initializes toolbar and set toolbar's title to "Settings" with color=white
    * */
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Settings");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
    }

    /**
     * Initializes listView
     * addLoader two, notification and help icons to the list
     *
     * */
    private void initListView() {
        final ListView settingsList=(ListView)findViewById(R.id.lvSettings);
        ArrayList<Integer> images = new ArrayList<>();
        images.add(R.drawable.ic_notifications_black_24dp);
        images.add(R.drawable.ic_help_black_24dp);
        ArrayAdapter adapter=new CustomSettingsAdapter(this,images);
        settingsList.setAdapter(adapter);

    }
}
