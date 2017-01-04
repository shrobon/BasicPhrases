package com.shrobon.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View v)
    {
        int id = v.getId();
        String ourID="";
        ourID = v.getResources().getResourceEntryName(id);
        Log.i("Button Tapped ?",ourID);

        //finding resource ID's of music
        int resourceId = getResources().getIdentifier(ourID,"raw","com.shrobon.basicphrases");
        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();
    }
}
