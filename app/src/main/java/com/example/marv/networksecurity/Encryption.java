package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Encryption extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encryption);

        WebView view = (WebView) findViewById(R.id.webviewEncryption);
        view.loadUrl("file:///android_asset/encryption.html");

        Button backButton = (Button) findViewById(R.id.backButtonEncryption);
        Button nextButton = (Button) findViewById(R.id.nextButtonEncryption);
        ImageView asymImage = (ImageView) findViewById(R.id.asymImage);
        ImageView symImage = (ImageView) findViewById(R.id.symmetricImage);

        backButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        asymImage.setOnClickListener(this);
        symImage.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.backButtonEncryption: {
                intent = new Intent(this, Attacks.class);
                break;
            }
            case R.id.nextButtonEncryption: {
                intent = new Intent (this, Vpn.class);
                break;
            }
            case R.id.symmetricImage: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.symVideo);
                break;
            }
            case R.id.asymImage: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.assymVideo);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
