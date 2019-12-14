package com.example.yuxiang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FourActivity extends AppCompatActivity {

    Button mButton1,mButton2,mButton3,mButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        initView();
        initEvent();
    }
    private void initView() {
        mButton1=findViewById(R.id.btn4_1);
        mButton2=findViewById(R.id.btn4_2);
        mButton3=findViewById(R.id.btn4_3);
        mButton4=findViewById(R.id.btn4_4);
    }
    private void initEvent() {
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FourActivity.this,MainActivity.class);
                startActivity(intent1);
                overridePendingTransition(0,0);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(FourActivity.this,TwoActivity.class);
                startActivity(intent1);
                overridePendingTransition(0,0);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(FourActivity.this,ThreeActivity.class);
                startActivity(intent4);
                overridePendingTransition(0,0);
            }
        });

    }
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
