package com.pratik.rexomusicplayer.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pratik.rexomusicplayer.R;

public class MainActivity extends BaseActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    BottomNavigationView bottomNavigationMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();
        bottomNavMainClick();
        initView();
    }

    private void findIds() {
        bottomNavigationMain = findViewById(R.id.bottomNavigationMain);
    }

    private void bottomNavMainClick() {
        bottomNavigationMain.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottomHome:
                        Log.i(TAG, "onNavigationItemSelected: Home");
                        break;

                    case R.id.bottomSearch:
                        Log.i(TAG, "onNavigationItemSelected: Search");
                        break;

                    case R.id.bottomLibrary:
                        Log.i(TAG, "onNavigationItemSelected: Your Library");
                        break;

                    case R.id.bottomHomeSetting:
                        Log.i(TAG, "onNavigationItemSelected: Setting");
                        break;
                }
                return false;
            }
        });
    }

    private void initView() {

    }
}