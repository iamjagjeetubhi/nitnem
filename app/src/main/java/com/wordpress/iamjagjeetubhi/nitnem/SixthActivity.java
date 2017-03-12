package com.wordpress.iamjagjeetubhi.nitnem;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class SixthActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sixth);
		
		  initTypeface();
    }
    
    private void initTypeface() {
    	
    	Typeface grunge = Typeface.createFromAsset(getAssets(), "fonts/GurbaniAkhar.ttf");
    	TextView titleText=(TextView) findViewById(R.id.chaupai);
    	titleText.setTypeface(grunge);
		

    }
}