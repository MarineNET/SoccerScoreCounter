package com.viktorkhon.soccerscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;
    int foulsA = 0;
    int foulsB = 0;

    public void displayTeamA(int score) {
        TextView scoreForA = (TextView) findViewById(R.id.teamAScore);
        scoreForA.setText(String.valueOf(score));
    }

    public void goalA(View view) {
        scoreA++;
        displayTeamA(scoreA);
    }

    public void displayTeamB(int score) {
        TextView scoreForA = (TextView) findViewById(R.id.teamBScore);
        scoreForA.setText(String.valueOf(score));
    }

    public void goalB(View view) {
        scoreB++;
        displayTeamB(scoreB);
    }

    public void displayTeamAFoul(int foul) {
        TextView foulForA = (TextView) findViewById(R.id.teamAFoul);
        foulForA.setText(String.valueOf(foul));
    }

    public void foulA(View view) {
        foulsA++;
        displayTeamAFoul(foulsA);
    }

    public void displayTeamBFoul(int foul) {
        TextView foulForB = (TextView) findViewById(R.id.teamBFoul);
        foulForB.setText(String.valueOf(foul));
    }

    public void foulB(View view) {
        foulsB++;
        displayTeamBFoul(foulsB);
    }
}
