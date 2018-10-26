package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Learn extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        CardView introCard = (CardView) findViewById(R.id.introCard);
        CardView attacksCard = (CardView) findViewById(R.id.attacksCard);
        CardView encryptionCard = (CardView) findViewById(R.id.encryptionCard);
        CardView vpnCard = (CardView) findViewById(R.id.vpnCard);
        CardView blockchainsCard = (CardView) findViewById(R.id.blockchainsCard);
        CardView swlCard = (CardView) findViewById(R.id.swlCard);

        introCard.setOnClickListener(this);
        attacksCard.setOnClickListener(this);
        encryptionCard.setOnClickListener(this);
        vpnCard.setOnClickListener(this);
        blockchainsCard.setOnClickListener(this);
        swlCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.introCard: {
                intent = new Intent(this, Introduction.class);
                break;
            }
            case R.id.attacksCard: {
                intent = new Intent(this, Attacks.class);
                break;
            }
            case R.id.encryptionCard: {
                intent = new Intent(this, Encryption.class);
                break;
            }
            case R.id.vpnCard: {
                intent = new Intent(this, Vpn.class);
                break;
            }
            case R.id.blockchainsCard: {
                intent = new Intent(this, Blockchains.class);
                break;
            }
            case R.id.swlCard: {
                intent = new Intent(this, Swl.class);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
