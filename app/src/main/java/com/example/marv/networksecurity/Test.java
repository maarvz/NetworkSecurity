package com.example.marv.networksecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity implements View.OnClickListener {

    //code learnt from https://www.youtube.com/watch?v=4g1_UH_6VQc

    private questionBank tQuestionBank = new questionBank();
    private TextView tQuestion;
    private Button tOption1;
    private Button tOption2;
    private Button tOption3;
    private Button tOption4;
    private String tAnswer;
    private static int tScore = 0;
    private int tQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        tScore = 0;

        tQuestion = (TextView) findViewById(R.id.question);
        tOption1 = (Button) findViewById(R.id.option1);
        tOption2 = (Button) findViewById(R.id.option2);
        tOption3 = (Button) findViewById(R.id.option3);
        tOption4 = (Button) findViewById(R.id.option4);
        Button mainmenuButton = (Button) findViewById(R.id.mainmenuButton);
        mainmenuButton.setOnClickListener(this);


        updateQuestion();


        tOption1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (tOption1.getText() == tAnswer) {
                    tScore = tScore + 1;
                    Toast.makeText(Test.this, "Correct!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                } else {
                    Toast.makeText(Test.this, "Incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        tOption2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (tOption2.getText() == tAnswer) {
                    tScore = tScore + 1;
                    updateQuestion();
                } else {
                    updateQuestion();
                }
            }
        });

        tOption3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (tOption3.getText() == tAnswer) {
                    tScore = tScore + 1;
                    updateQuestion();
                } else {
                    updateQuestion();
                }
            }
        });

        tOption4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (tOption4.getText() == tAnswer) {
                    tScore = tScore + 1;
                    updateQuestion();
                } else {
                    updateQuestion();
                }
            }
        });

    }

    private void updateQuestion() {
        Intent intent = null;
        if (tQuestionNumber <= 9) {
            tQuestion.setText(tQuestionBank.getQuestion(tQuestionNumber));
            tOption1.setText(tQuestionBank.getOption1(tQuestionNumber));
            tOption2.setText(tQuestionBank.getOption2(tQuestionNumber));
            tOption3.setText(tQuestionBank.getOption3(tQuestionNumber));
            tOption4.setText(tQuestionBank.getOption4(tQuestionNumber));
            tAnswer = tQuestionBank.getRightAnswer(tQuestionNumber);
            tQuestionNumber++;
        } else {
            intent = new Intent (this, ScoreScreen.class);
            intent.putExtra("numberScore",tScore);
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.mainmenuButton: {
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            }
        }
    }

    public static int getScore() {
        return tScore;
    }
}
