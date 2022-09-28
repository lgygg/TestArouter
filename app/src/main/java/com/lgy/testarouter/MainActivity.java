package com.lgy.testarouter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author: Administrator
 * @date: 2022/9/28
 */
@Route(path = "/homepage/MainActivity")
public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout body = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        body.setLayoutParams(params);
        body.setOrientation(LinearLayout.VERTICAL);
        body.setGravity(Gravity.CENTER);
        TextView text = new TextView(this);
        body.addView(text);
        text.setText("app module");
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/moudleA/MoudleAActivity").navigation(MainActivity.this,100);
            }
        });
        setContentView(body);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100){
            Log.e("lgy","onActivityResult=========");
        }
    }
}
