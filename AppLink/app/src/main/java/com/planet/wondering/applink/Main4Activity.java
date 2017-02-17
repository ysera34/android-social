package com.planet.wondering.applink;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class Main4Activity extends AppCompatActivity {

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mTextView = (TextView) findViewById(R.id.text_view);

        Uri uriData = getIntent().getData();
        List<String> uriDataList = uriData.getPathSegments();
        for (String s : uriDataList) {
            Log.i("uriData.getPathSegments", s);
        }

        String name = uriData.getQueryParameter("name");
        mTextView.setText(name);

    }
}
