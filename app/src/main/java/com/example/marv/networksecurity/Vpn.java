package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Vpn extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vpn);

        WebView view = (WebView) findViewById(R.id.webviewVpn);
        view.loadUrl("file:///android_asset/vpn.html");

        Button backButton = (Button) findViewById(R.id.backButtonVpn);
        Button nextButton = (Button) findViewById(R.id.nextButtonVpn);
        ImageView vpnImage = (ImageView) findViewById(R.id.vpnImage);

        backButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        vpnImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.backButtonVpn: {
                intent = new Intent(this, Encryption.class);
                break;
            }
            case R.id.nextButtonVpn: {
                intent = new Intent (this, Blockchains.class);
                break;
            }
            case R.id.vpnImage: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.vpnVideo);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
