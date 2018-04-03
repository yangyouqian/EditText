package com.learn.yhviews.musicemaillogin;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by yhviews on 2018/3/16.
 */

public class MyTitleView extends Toolbar{
    private Button titleBackBtn;
    private TextView titleName;
    public MyTitleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public MyTitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.title_include, this);

        titleBackBtn = findViewById(R.id.btn_title_back);
        titleName = findViewById(R.id.title_name);
        titleBackBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyTitleStyle);
        String title = typedArray.getString(R.styleable.MyTitleStyle_titleName);
        titleName.setText(title);
    }
}
