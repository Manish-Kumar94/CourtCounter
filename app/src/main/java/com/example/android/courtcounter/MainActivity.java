package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void increment3A(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void increment2A(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void freeThrowA(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void increment3B(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void increment2B(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void freeThrowB(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    public void displayA(int number) {
        TextView score = (TextView) findViewById(R.id.teamAscore);
        score.setText("" + number);
    }

    public void displayB(int number) {
        TextView score = (TextView) findViewById(R.id.teamBscore);
        score.setText("" + number);
    }
}
