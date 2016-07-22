package com.example.asus.lab04_viewpager_flashcard;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        setupToolbar();
        setupAdapterForViewPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupToolbar() {
        toolbar.setNavigationIcon(R.drawable.ic_keyboard_backspace_white_36pt);
        toolbar.setTitle("Toolbar");
        toolbar.setTitleTextColor(Color.WHITE);
    }

    private void setupAdapterForViewPager() {
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabOneFragment(),"Tab One");
        adapter.addFragment(new TabTwoFragment(),"Tab Two");
        adapter.addFragment(new TabThreeFragment(),"Tab Three");
        viewPager.setAdapter(adapter);
    }

    private void setupView() {
        tabLayout=(TabLayout)findViewById(R.id.tabs);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
    }
}
