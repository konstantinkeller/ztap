package com.jskgames.ztap;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import com.jskgames.ztap.Spawn;
import java.util.Arrays;

public class Test extends Activity {
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

        setContentView(R.layout.test);

    }
    
    public void genSeq(View v) {
    	TextView seq = (TextView) findViewById(R.id.seq);
    	int sequence[] = Spawn.sequenceGen(6,Spawn.randInt(1,8));
    	seq.setText(Arrays.toString(sequence));
    }
}