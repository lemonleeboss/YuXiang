package com.example.yuxiang.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuxiang.Base.BaseFragment;
import com.example.yuxiang.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fiveFragment extends BaseFragment {


    public fiveFragment() {
        // Required empty public constructor
    }



    @Override
    protected View onSubViewLoaded(LayoutInflater layoutInflater, ViewGroup container) {
        View rootView=layoutInflater.inflate(R.layout.fragment_five,container,false);
        return rootView;
    }

}
