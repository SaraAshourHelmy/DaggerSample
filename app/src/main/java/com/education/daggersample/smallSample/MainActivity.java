package com.education.daggersample.smallSample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.education.daggersample.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    TextView tv_target;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();

    }

    private void bindView() {

        tv_target = (TextView) findViewById(R.id.tv_target);
        //flag = (apiNetwork == null) ? false : true;

        CustomUser customUser = new CustomUser();
        customUser.showUser();

        Custom2 custom2 = new Custom2();
        custom2.getData();
        //tv_target.setText("Dagger work :" + String.valueOf(flag));

    }


}
