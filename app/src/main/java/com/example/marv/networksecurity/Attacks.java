package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Attacks extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attacks);

        WebView view = (WebView) findViewById(R.id.webviewAttacks);
        view.loadUrl("file:///android_asset/networkattacks.html");

        Button backButton = (Button) findViewById(R.id.attacksBackButton);
        Button nextButton = (Button) findViewById(R.id.attacksNextButton);

        backButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.attacksBackButton: {
                intent = new Intent(this, Introduction.class);
                break;
            }
            case R.id.attacksNextButton: {
                intent = new Intent (this, Encryption.class);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
