package ru.mirea.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toPlay(View v) {

        player = MediaPlayer.create(this, R.raw.mozart);

        Button btn3 = findViewById(R.id.button3);


        if(v.getId() == R.id.button3) {
            btn3.setText("Ура!");
        }
        if(v.getId() == R.id.button2) {

            player.start();
            player.release();

        }
    }

}