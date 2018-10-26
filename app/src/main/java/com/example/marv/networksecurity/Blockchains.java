package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Blockchains extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blockchains);

        WebView view = (WebView) findViewById(R.id.webviewBlockchains);
        view.loadUrl("file:///android_asset/blockchains.html");

        Button backButton = (Button) findViewById(R.id.backButtonBlockchains);
        Button nextButton = (Button) findViewById(R.id.nextButtonBlockchains);
        ImageView blockchainsImage = (ImageView) findViewById(R.id.blockchainsImage);

        backButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        blockchainsImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.backButtonBlockchains: {
                intent = new Intent(this, Vpn.class);
                break;
            }
            case R.id.nextButtonBlockchains: {
                intent = new Intent (this, Swl.class);
                break;
            }
            case R.id.blockchainsImage: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.blockchainsVideo);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
