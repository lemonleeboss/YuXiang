package com.example.yuxiang.utils;

import com.example.yuxiang.Base.BaseFragment;
import com.example.yuxiang.fragments.eightFragment;
import com.example.yuxiang.fragments.fiveFragment;
import com.example.yuxiang.fragments.fourFragment;
import com.example.yuxiang.fragments.oneFragment;
import com.example.yuxiang.fragments.sevenFragment;
import com.example.yuxiang.fragments.sixFragment;
import com.example.yuxiang.fragments.threeFragment;
import com.example.yuxiang.fragments.twoFragment;

import java.util.HashMap;
import java.util.Map;

public class FragmentCreator {

    private final static int INDEX_ONE=0;
    private final static int INDEX_TWO=1;
    private final static int INDEX_THREE=2;
    private final static int INDEX_FOUR=3;
    private final static int INDEX_FIVE=4;
    private final static int INDEX_SIX=5;
    private final static int INDEX_SEVEN=6;
    private final static int INDEX_EIGHT=7;

    public final static int PAGE_COUNT=8;

    private static Map<Integer, BaseFragment> sCache=new HashMap<>();

    public static BaseFragment getFragment(int index){
        BaseFragment baseFragment=sCache.get(index);
        if (baseFragment != null) {
            return baseFragment;
        }
        switch (index){
            case INDEX_ONE:
                baseFragment=new oneFragment();
                break;
            case INDEX_TWO:
                baseFragment=new twoFragment();
                break;
            case INDEX_THREE:
                baseFragment=new threeFragment();
                break;
            case INDEX_FOUR:
                baseFragment=new fourFragment();
                break;
            case INDEX_FIVE:
                baseFragment=new fiveFragment();
                break;
            case INDEX_SIX:
                baseFragment=new sixFragment();
                break;
            case INDEX_SEVEN:
                baseFragment=new sevenFragment();
                break;
            case INDEX_EIGHT:
                baseFragment=new eightFragment();
                break;
        }
        sCache.put(index,baseFragment);
        return baseFragment;
    }
}
