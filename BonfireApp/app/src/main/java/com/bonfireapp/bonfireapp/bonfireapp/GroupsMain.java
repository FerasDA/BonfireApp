package com.bonfireapp.bonfireapp.bonfireapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class GroupsMain extends Fragment {


    View view;
    int mCurrentPosition = -1;
    final static String ARG_POSITION = "position";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(savedInstanceState != null)
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);

        view = inflater.inflate(R.layout.activity_groups, container, false);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
}
