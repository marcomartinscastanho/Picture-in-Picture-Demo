package com.martinscastanho.marco.pictureinpicturedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pipButton = findViewById(R.id.pipButton);
    }

    public void goPip(View view){
        // get rid of the button
        pipButton.setVisibility(View.INVISIBLE);
        // get rid of the bar
        getSupportActionBar().hide();

        // actually go PiP
        enterPictureInPictureMode();
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);

        if(isInPictureInPictureMode){
            // GOING INTO PiP
            // get rid of the button
            // get rid of the bar
            // BUT WE'RE ACTUALLY DOING THAT ON THE BUTTON CLICK
            // SO THAT IT DOES IT BEFORE GOING PiP
        }
        else{
            // GOING OUT OF PiP
            // show back the button
            pipButton.setVisibility(View.VISIBLE);
            // show back the bar
            getSupportActionBar().show();
        }
    }
}
