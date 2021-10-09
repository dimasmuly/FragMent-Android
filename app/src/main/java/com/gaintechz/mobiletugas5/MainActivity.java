package com.gaintechz.mobiletugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottom;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom = findViewById(R.id.nav_bottom);
        NavHostFragment pottom = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.host_fragment);
        NavigationUI.setupWithNavController(bottom, pottom.getNavController());
    }
}