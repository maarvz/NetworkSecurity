package com.example.marv.networksecurity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Introduction extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        WebView view = (WebView) findViewById(R.id.webviewIntroduction);
        view.loadUrl("file:///android_asset/intronetworksecurity.html");

        Button backButton = (Button) findViewById(R.id.backButton);
        Button nextButton = (Button) findViewById(R.id.nextButton);

        backButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.backButton: {
                intent = new Intent (this, Learn.class);
                break;
            }
            case R.id.nextButton: {
                intent = new Intent (this, Attacks.class);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
