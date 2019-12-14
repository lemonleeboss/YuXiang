package com.example.yuxiang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.yuxiang.adapters.IndicatorAdapter;
import com.example.yuxiang.adapters.MainContentAdapter;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;

public class MainActivity extends FragmentActivity {

    private static final String TAG ="FragmentActivity" ;
    Button mButton1,mButton2,mButton3,mButton4;
    EditText mEt_search;
    private MagicIndicator mMagicIndicator;
    private ViewPager mContentPager;
    private IndicatorAdapter mIndicatorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();

    }


    private void initView() {
        mButton1=findViewById(R.id.btn1_1);
        mButton2=findViewById(R.id.btn1_2);
        mButton3=findViewById(R.id.btn1_3);
        mButton4=findViewById(R.id.btn1_4);
        mEt_search=findViewById(R.id.et_search1);
        mMagicIndicator = findViewById(R.id.main_indicator);
        mMagicIndicator.setBackgroundColor(Color.WHITE);
        //创建indicator的适配器
        mIndicatorAdapter = new IndicatorAdapter(this);
        CommonNavigator commonNavigator=new CommonNavigator(this);
//        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(mIndicatorAdapter);

        //ViewPager
        mContentPager = this.findViewById(R.id.content_pager);

        //创建内容适配器
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        MainContentAdapter mainContentAdapter=new MainContentAdapter(supportFragmentManager);

        mContentPager.setAdapter(mainContentAdapter);



        //把ViewPager和indicator绑定到一起
        mMagicIndicator.setNavigator(commonNavigator);
        ViewPagerHelper.bind(mMagicIndicator, mContentPager);


    }
    private void initEvent() {
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,TwoActivity.class);
                startActivity(intent2);
                overridePendingTransition(0,0);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,ThreeActivity.class);
                startActivity(intent3);
                overridePendingTransition(0,0);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,FourActivity.class);
                startActivity(intent4);
                overridePendingTransition(0,0);
            }
        });
        mEt_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Search.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        mIndicatorAdapter.setOnIndicatorClickListener(new IndicatorAdapter.OnIndicatorTapClickListener() {
            @Override
            public void onTabClick(int index) {
                Log.d(TAG,"click index is-->"+index);
                if (mContentPager != null) {
                    mContentPager.setCurrentItem(index);
                }
            }
        });


    }


    /**
     * 第一种解决办法 通过监听keyUp
     * @param keyCode
     * @param event
     * @return
     */

    private long firstTime = 0;
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
            long secondTime = System.currentTimeMillis();
            if (secondTime - firstTime > 2000) {
                Display display = getWindowManager().getDefaultDisplay();
                // 获取屏幕高度
                int height = display.getHeight();
                Toast toast = Toast.makeText(this, "再按一次退出余香", Toast.LENGTH_SHORT);
                // 这里给了一个1/4屏幕高度的y轴偏移量
                toast.setGravity(Gravity.TOP, 0, height/2);
//                toast.setView(R.color.colorAccent);
                toast.show();
                firstTime = secondTime;
                return true;
            } else {
                moveTaskToBack(true);
            }
        }

        return super.onKeyUp(keyCode, event);
    }



}
