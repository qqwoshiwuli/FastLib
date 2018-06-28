package com.aries.library.fast.demo.module.main.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.aries.library.fast.demo.R;

/**
 * Created: AriesHoo on 2018/6/28 10:23
 * E-Mail: AriesHoo@126.com
 * Function: 模拟非FastLib三方库且未实现状态栏沉浸效果
 * Description:
 */
public class TestStatusActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_status);
    }

}
