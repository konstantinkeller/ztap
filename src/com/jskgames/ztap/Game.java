package com.jskgames.ztap;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Typeface;

public class Game extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);

        getWindow().getDecorView().setSystemUiVisibility(
        		View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        setContentView(R.layout.game);
        
        TextView gamePlaceholder = (TextView) findViewById(R.id.game_placeholder);
        gamePlaceholder.setTypeface(null, Typeface.BOLD);
    }
}