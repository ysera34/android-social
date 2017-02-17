package com.planet.wondering.applink;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView mTextView1;
    private TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView1 = (TextView) findViewById(R.id.text_view1);
        mTextView2 = (TextView) findViewById(R.id.text_view2);

        Uri uriData = getIntent().getData();
        String tag = uriData.getQueryParameter("tag");
        String code = uriData.getQueryParameter("code");
        String accessToken = uriData.getQueryParameter("accesstoken");

        mTextView1.setText(accessToken);
//        mTextView2.setText(code);
    }
}
