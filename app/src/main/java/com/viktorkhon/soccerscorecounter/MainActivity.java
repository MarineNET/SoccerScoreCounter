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
    // Initialize starting scores and fouls at 0
    private int scoreA = 0;
    private int scoreB = 0;
    private int foulsA = 0;
    private int foulsB = 0;

    // Create a method which finds text view that displays score for team A
    // and then sets a new text from an int score
    public void displayTeamA(int score) {
        TextView scoreForA = (TextView) findViewById(R.id.teamAScore);
        scoreForA.setText(String.valueOf(score));
    }

    // Create a method when a button assigned to goalA is clicked, scoreA will
    // increase by 1 and then displays the total to a corresponding Text View
    public void goalA(View view) {
        scoreA++;
        displayTeamA(scoreA);
    }

    // Create a method which finds text view that displays score for team B
    // and then sets a new text from an int score
    public void displayTeamB(int score) {
        TextView scoreForA = (TextView) findViewById(R.id.teamBScore);
        scoreForA.setText(String.valueOf(score));
    }

    // Create a method when a button assigned to goalB is clicked, scoreB will
    // increase by 1 and then displays the total to a corresponding Text View
    public void goalB(View view) {
        scoreB++;
        displayTeamB(scoreB);
    }

    // Create a method which finds text view that displays fouls for team A
    // and then sets a new text from an int foul
    public void displayTeamAFoul(int foul) {
        TextView foulForA = (TextView) findViewById(R.id.teamAFoul);
        foulForA.setText(String.valueOf(foul));
    }

    // Create a method when a button assigned to foulA is clicked, foulsA will
    // increase by 1 and then displays the total to a corresponding Text View
    public void foulA(View view) {
        foulsA++;
        displayTeamAFoul(foulsA);
    }

    // Create a method which finds text view that displays fouls for team B
    // and then sets a new text from an int foul
    public void displayTeamBFoul(int foul) {
        TextView foulForB = (TextView) findViewById(R.id.teamBFoul);
        foulForB.setText(String.valueOf(foul));
    }

    // Create a method when a button assigned to foulB is clicked, foulsB will
    // increase by 1 and then displays the total to a corresponding Text View
    public void foulB(View view) {
        foulsB++;
        displayTeamBFoul(foulsB);
    }

    // Create a method, when Reset button is clicked, change all displays to 0
    // then assign a value of 0 to all instance variables
    public void reset(View view) {
        displayTeamA(0);
        displayTeamAFoul(0);
        displayTeamB(0);
        displayTeamBFoul(0);
        scoreA = 0;
        scoreB = 0;
        foulsA = 0;
        foulsB = 0;
    }
}
