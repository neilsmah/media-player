package com.example.user.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.luv_letter);

        Button playbtn = (Button) findViewById(R.id.playbtn);
        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mediaPlayer.start();
            }
        });

        Button pausebtn = (Button) findViewById(R.id.pausebtn);
        pausebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mediaPlayer.pause();
            }
        });

        final Button volumebtn = (Button) findViewById(R.id.volbtn);
        volumebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mediaPlayer.setVolume(2,2);
            }
        });

        Button resetbtn = (Button) findViewById(R.id.resetbtn);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mediaPlayer.seekTo(0);
            }
        });
    }


}
