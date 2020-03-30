package com.example.videoviewer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView);
        mController = new MediaController(this);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.freestyle);
        mController.setAnchorView(videoView);
        videoView.setMediaController(mController);
        videoView.start();
    }
}
