package com.jskgames.ztap;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;

public class Main extends Activity {
		
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

        setContentView(R.layout.main);
        

    }
        
    public void startGame(View v) {
    	Intent startGameIntent = new Intent(Main.this, Game.class);
    	Main.this.startActivity(startGameIntent);
    }
    
    public void enterTest(View v) {
    	Intent startTestIntent = new Intent(Main.this, Test.class);
    	Main.this.startActivity(startTestIntent);
    }

}