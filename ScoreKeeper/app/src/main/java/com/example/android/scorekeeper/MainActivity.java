package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0, foulsA = 0;
    int scoreB = 0, foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreA++;
        displayScoreForTeamA(scoreA);
    }

    /**
     * Increase the fouls for Team A by 1 point.
     */
    public void addFoulForTeamA(View v) {
        foulsA++;
        displayFoulsForTeamA(foulsA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreB++;
        displayScoreForTeamB(scoreB);
    }

    /**
     * Increase the fouls for Team A by 1 point.
     */
    public void addFoulForTeamB(View v) {
        foulsB++;
        displayFoulsForTeamB(foulsB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset scores of Teams A and B
     */
    public void reset(View view) {
        scoreA = scoreB = 0;
        foulsA = foulsB = 0;

        displayScoreForTeamA(scoreA);
        displayScoreForTeamB(scoreB);
        displayFoulsForTeamA(foulsA);
        displayFoulsForTeamB(foulsB);
    }
}
