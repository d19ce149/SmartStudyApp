package com.amitvikram.smartstudyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements HomeFragment.OnFragmentInteractionListener, BookFragment.OnFragmentInteractionListener, VideoFragment.OnFragmentInteractionListener, UserFragment.OnFragmentInteractionListener {
    Intent intent;
    BottomNavigationView bottomNavigationView;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sessionManager = new SessionManager(this);
        intent = new Intent(MainActivity.this, LoginActivity.class);
        final HomeFragment homeFragment = new HomeFragment();
        final VideoFragment videoFragment = new VideoFragment();
        final BookFragment bookFragment = new BookFragment();
        final UserFragment userFragment = new UserFragment();
        setFragment(homeFragment);
        bottomNavigationView = findViewById(R.id.bottom_nav_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        setFragment(homeFragment);
                        return true;
                    case R.id.nav_book:
                        setFragment(bookFragment);
                        return true;
                    case R.id.nav_video:
                        setFragment(videoFragment);
                        return true;
                    case R.id.nav_user:
                        setFragment(userFragment);
                        return true;
                    default:
                        return false;
                }
            }
        });

    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}