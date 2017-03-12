package com.wordpress.iamjagjeetubhi.nitnem;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {
	
	/** Called when the activity is first created. */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);

		  initTypeface();
    }

    private void initTypeface() {

    	Typeface grunge = Typeface.createFromAsset(getAssets(), "fonts/GurbaniAkhar.ttf");
        TextView titleText=(TextView) findViewById(R.id.japji1);
    	titleText.setTypeface(grunge);
    	
    	
    	

            }


    }

     