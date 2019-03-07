package com.example.letsplay;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.google.firebase.database.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private RecyclerView postList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView postList = (RecyclerView) findViewById(R.id.postList);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawable_Layout);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                UserMenuSelector(item);
                return false;
            }
        });


        private void UserMenuSelector(MenuItem item)
        {
            switch (item.getItemId())
            {
                
            }
        }

    }
}
