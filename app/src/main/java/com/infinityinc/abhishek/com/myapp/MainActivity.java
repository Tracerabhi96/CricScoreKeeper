package com.infinityinc.abhishek.com.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score = 0;
    float balls = 0;
    private int wickets = 0;
    private static final String TAG = "MainActivity";
    private final String TEXT_CONTENTS = "text_contents";
    TextView scoreTextView ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: in the increate method");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTextView = (TextView) findViewById(R.id.score);

    }


    //method to ADD THE SCORE
    public void addScore(View view) {

        // TO ADD 1 RUN TO THE SCOREBOARD
        Button oneButton = (Button) findViewById(R.id.onebutton);


        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 1;
                balls = balls + 1;
                displayScore(score);
                displayBalls(balls);


            }
        });


        // TO ADD 2 RUN TO THE SCOREBOARD
        Button twoButton = (Button) findViewById(R.id.twobutton);


        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                balls = balls + 1;
                score = score + 2;
                displayScore(score);

                displayBalls(balls);


            }
        });


        // TO ADD 3 RUNS TO THE SCOREBOARD
        Button threeButton = (Button) findViewById(R.id.threebutton);


        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 3;
                balls = balls + 1;
                displayBalls(balls);
                displayScore(score);


            }
        });


        // TO ADD 4 RUNS TO THE SCOREBOARD
        Button fourButton = (Button) findViewById(R.id.fourbutton);


        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 4;
                balls = balls + 1;
                displayBalls(balls);
                displayScore(score);


            }

        });


        // TO ADD 5 RUNS TO THE SCOREBOARD
        Button fiveButton = (Button) findViewById(R.id.fivebutton);


        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 5;
                balls = balls + 1;
                displayBalls(balls);
                displayScore(score);

            }

        });


        // TO ADD 6 RUNS TO THE SCOREBOARD
        Button sixButton = (Button) findViewById(R.id.sixbutton);


        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 6;
                balls = balls + 1;
                displayBalls(balls);
                displayScore(score);

            }

        });


        // TO ADD wIDE RUN Functionality TO THE SCOREBOARD
        Button wideButton = (Button) findViewById(R.id.widebutton);
        wideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 1;
                displayScore(score);
            }
        });

        // TO ADD No Ball Functionality TO THE SCOREBOARD
        Button noBallButton = (Button) findViewById(R.id.noballbutton);
        noBallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 1;
                displayScore(score);
            }
        });

        // TO ADD Reset Functionality
        Button resetButton = (Button) findViewById(R.id.RESET);
        final TextView outTextview = (TextView) findViewById(R.id.wickets);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                balls = 0;
                wickets = 0;
                displayScore(score);
                displayBalls(balls);
                outTextview.setText(" " + wickets);

            }
        });

        //TO ADD FUNCTIONALITY TO OUT BUTTON
        Button outButton = (Button) findViewById(R.id.outbutton);

        outButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                balls = balls + 1;
                wickets = wickets + 1;
                outTextview.setText(" " + wickets);
                displayBalls(balls);


            }
        });


        Log.d(TAG, "displayBalls: exiting oncreate method");

    }


    public void displayScore(int n) {
        scoreTextView.setText(" " + n);
    }

    public float displayBalls(float balls) {
        TextView ballsTextView = (TextView) findViewById(R.id.balls);
        ballsTextView.setText(" " + balls);

        return balls;


    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: in");
        outState.putString(TEXT_CONTENTS, scoreTextView.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: out");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTextView.setText(savedInstanceState.getString(TEXT_CONTENTS));
    }
}
