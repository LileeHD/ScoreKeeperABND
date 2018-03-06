package com.example.android.scorekeeperabnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int clickCountA = 0;
    int clickCountB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Team A counter
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamKillA(int score) {
        TextView countView = findViewById(R.id.click_counter_a);
        countView.setText(String.valueOf(score));
    }

    public void addOnePointA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addFourPointsA(View view) {
        scoreTeamA += 4;
        displayForTeamA(scoreTeamA);
        clickCountA += 1;
        displayTeamKillA(clickCountA);
    }

    /**
     * Team B counter
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamKillB(int score) {
        TextView countView = findViewById(R.id.click_counter_b);
        countView.setText(String.valueOf(score));
    }

    public void addOnePointB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void addFourPointsB(View view) {
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB);
        clickCountB += 1;
        displayTeamKillB(clickCountB);
    }

    /**
     * Reset button
     */
    public void resetGame(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        clickCountA = 0;
        clickCountB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayTeamKillA(clickCountA);
        displayTeamKillB(clickCountB);
    }
}
