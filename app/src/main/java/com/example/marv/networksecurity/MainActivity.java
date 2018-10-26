package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView learnCard = (CardView) findViewById(R.id.learnCard);
        CardView testCard = (CardView) findViewById(R.id.testCard);
        CardView resourcesCard = (CardView) findViewById(R.id.resourcesCard);

        learnCard.setOnClickListener(this);
        testCard.setOnClickListener(this);
        resourcesCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.learnCard: {
                intent = new Intent(this, Learn.class);
                break;
            }
            case R.id.testCard: {
                intent = new Intent(this, Test.class);
                break;
            }
            case R.id.resourcesCard: {
                intent = new Intent(this, ExtraResources.class);
                break;
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
