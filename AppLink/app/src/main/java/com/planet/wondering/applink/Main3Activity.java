package com.planet.wondering.applink;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView mTextView1;
    private TextView mTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTextView1 = (TextView) findViewById(R.id.text_view1);
        mTextView2 = (TextView) findViewById(R.id.text_view2);

        Uri uriData = getIntent().getData();
        String accessToken = uriData.getQueryParameter("accessToken");
//        String code = uriData.getQueryParameter("code");

        mTextView1.setText(accessToken);
//        mTextView2.setText(code);
    }
}
