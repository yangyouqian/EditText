package com.learn.yhviews.musicemaillogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //TODO 解决setCleanButton这种不好的写法
    //TODO 解决AutoCompleteTextView 输入空格不会出现提示的问题
    //TODO 适配低版本
    //TODO 将布局中重复的属性提取到style文件中

    private EmailAutoTextView emailAutoTextView;
    private Button cleanBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailAutoTextView = findViewById(R.id.act_email);
        cleanBtn = findViewById(R.id.btn_clean);
        emailAutoTextView.setCleanButton(cleanBtn);
        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailAutoTextView.setText("");
            }
        });

    }
}
