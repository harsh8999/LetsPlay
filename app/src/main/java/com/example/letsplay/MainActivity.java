package com.example.letsplay;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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
            View navView = navigationView.inflateHeaderView(R.layout.navigation_header);
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
                case R.id.nav_profile:
                    Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.nav_home:
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.nav_messages:
                    Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_settings:
                    Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.nav_Logout:
                    Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                    break;
            }

        }

    }
}
