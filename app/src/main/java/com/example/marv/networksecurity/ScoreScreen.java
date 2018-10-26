package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen);


        Button buttonScore = (Button) findViewById(R.id.mainMenuScore);
        buttonScore.setOnClickListener(this);

       final TextView scoreView = (TextView) findViewById(R.id.scoreView);

        Bundle bundle = getIntent().getExtras();
        int value = bundle.getInt("numberScore");
        scoreView.setText(String.valueOf(value)+ " " + "out of 10");
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.mainMenuScore: {
                intent = new Intent (this, MainActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
