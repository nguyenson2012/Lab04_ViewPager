package com.example.asus.lab04_viewpager_flashcard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Asus on 7/22/2016.
 */
public class TabOneFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.tab_one_layout,container,false);
        return rootview;
    }
}
