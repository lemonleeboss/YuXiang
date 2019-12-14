package com.example.yuxiang.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.example.yuxiang.MainActivity;
import com.example.yuxiang.R;

import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.WrapPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

public class IndicatorAdapter extends CommonNavigatorAdapter {


    private final String[] mTitles;
    private OnIndicatorTapClickListener mOnTabClickListener;

    public IndicatorAdapter(Context context) {
        mTitles = context.getResources().getStringArray(R.array.indicator_title);
    }

    @Override
    public int getCount() {
        if (mTitles != null) {
            return mTitles.length;
        }
        return 0;
    }

    @Override
    public IPagerTitleView getTitleView(Context context, final int index) {
        SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(context);
        simplePagerTitleView.setText(mTitles[index]);
        simplePagerTitleView.setNormalColor(Color.parseColor("#333333"));
        simplePagerTitleView.setSelectedColor(Color.parseColor("#e94220"));
        simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //切换viewPager的内容，如果index不一样
                if (mOnTabClickListener != null) {
                    mOnTabClickListener.onTabClick(index);
                }
            }
        });
        return simplePagerTitleView;
    }

    @Override
    public IPagerIndicator getIndicator(Context context) {
        WrapPagerIndicator indicator = new WrapPagerIndicator(context);
        indicator.setFillColor(Color.parseColor("#ebe4e3"));
        return indicator;
    }

    public void setOnIndicatorClickListener(OnIndicatorTapClickListener listener){
        this.mOnTabClickListener=listener;
    }
    public interface OnIndicatorTapClickListener{
        void onTabClick(int index);
    }

}

