package com.example.asus.lab04_viewpager_flashcard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 7/22/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment> listFragment=new ArrayList<Fragment>();
    private List<String> fragentTitles=new ArrayList<String>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }
    public void addFragment(Fragment fragment,String title){
        listFragment.add(fragment);
        fragentTitles.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragentTitles.get(position);
    }
}
