package com.example.yuxiang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class Search extends AppCompatActivity {

    EditText mEt_search2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        initEven();

    }


    private void initView() {
        mEt_search2=findViewById(R.id.et_search2);
    }
    private void initEven() {
        mEt_search2.requestFocus();
        InputMethodManager imm =(InputMethodManager)mEt_search2.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0,InputMethodManager.SHOW_FORCED);
    }


}
