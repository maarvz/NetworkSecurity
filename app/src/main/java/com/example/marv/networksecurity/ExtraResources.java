package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class ExtraResources extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_resources);

        ImageView asymmetricPreview = (ImageView) findViewById(R.id.asymmetricPreview);
        ImageView symmetricPreview = (ImageView) findViewById(R.id.symmetricPreview);
        ImageView vpnPreview = (ImageView) findViewById(R.id.vpnPreview);
        ImageView blockchainPreview = (ImageView) findViewById(R.id.blockchainPreview);
        ImageView wirelessPreview = (ImageView) findViewById(R.id.wirelessPreview);
        ImageView firewallPreview = (ImageView) findViewById(R.id.firewallPreview);
        Button backButtonExtra = (Button) findViewById(R.id.backButtonExtra);

        asymmetricPreview.setOnClickListener(this);
        symmetricPreview.setOnClickListener(this);
        vpnPreview.setOnClickListener(this);
        blockchainPreview.setOnClickListener(this);
        wirelessPreview.setOnClickListener(this);
        firewallPreview.setOnClickListener(this);
        backButtonExtra.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.asymmetricPreview: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.assymVideo);
                break;
            }
            case R.id.symmetricPreview: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.symVideo);
                break;
            }
            case R.id.vpnPreview: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.vpnVideo);
                break;
            }
            case R.id.blockchainPreview: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.blockchainsVideo);
                break;
            }
            case R.id.wirelessPreview: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.wirelessVideo);
                break;
            }
            case R.id.firewallPreview: {
                intent = YouTubeStandalonePlayer.createVideoIntent(this, Youtube.GOOGLE_API_KEY, Youtube.firewallVideo);
                break;
            }
            case R.id.backButtonExtra: {
                intent = new Intent (this, MainActivity.class);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
