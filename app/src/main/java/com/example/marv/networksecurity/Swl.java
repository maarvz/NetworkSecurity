package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Swl extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swl);

        WebView view = (WebView) findViewById(R.id.webviewSwl);
        view.loadUrl("file:///android_asset/swl.html");

        Button backButton = (Button) findViewById(R.id.backButtonSwl);
        Button nextButton = (Button) findViewById(R.id.nextButtonSwl);
        ImageView wirelessImage = (ImageView) findViewById(R.id.wirelessImage);
        ImageView firewallImage = (ImageView) findViewById(R.id.firewallImage);

        backButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        wirelessImage.setOnClickListener(this);
        firewallImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.backButtonSwl: {
                intent = new Intent(this, Blockchains.class);
                break;
            }
            case R.id.nextButtonSwl: {
                intent = new Intent (this, Test.class);
                break;
            }
            case R.id.wirelessImage: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.wirelessVideo);
                break;
            }
            case R.id.firewallImage: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.firewallVideo);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
