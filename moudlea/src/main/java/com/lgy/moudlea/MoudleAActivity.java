package com.lgy.moudlea;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @author: Administrator
 * @date: 2022/9/28
 */
@Route(path = "/moudleA/MoudleAActivity")
public class MoudleAActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout body = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        body.setLayoutParams(params);
        body.setOrientation(LinearLayout.VERTICAL);
        body.setGravity(Gravity.CENTER);
        TextView text = new TextView(this);
        body.addView(text);
        text.setText("module a");
        setContentView(body);
    }
}
