/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.golfscorekeeper;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.example.android.golfscorekeeper.R;

import java.text.NumberFormat;

/**
 * This app displays a way to keep track of a basketball score.
 */
public class MainActivity extends AppCompatActivity {

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Player 1 or 2 by 3 strokes.
     */
    public void addThreeForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 3;
        displayForPlayer1(scorePlayer1);
    }

    public void addThreeForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 3;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 1 or 2 by 2 strokes.
     */
    public void addTwoForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 2;
        displayForPlayer1(scorePlayer1);
    }

    public void addTwoForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 2;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 1 or 2 by 1 stroke.
     */
    public void addOneForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    public void addOneForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Displays the given score for Team A & Team B.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the scores for Team A & B.
     */
    public void resetScores(View v){
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }

}
