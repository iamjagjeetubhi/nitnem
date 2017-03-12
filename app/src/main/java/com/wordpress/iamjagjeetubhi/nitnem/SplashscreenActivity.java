package com.wordpress.iamjagjeetubhi.nitnem;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class SplashscreenActivity extends Activity {

	public void onAttachedToWindow() {
		super.onAttachedToWindow();
		Window window = getWindow();
		window.setFormat(PixelFormat.RGBA_8888);
	}

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_NO_TITLE);

		/** Making this activity, full screen */
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_splashscreen);
		CountDown _tik;
		_tik = new CountDown(2000, 2000, this, MainActivity.class);// It delay the screen for 2.5 second and after that switch to YourNextActivity
		_tik.start();

		initTypeface();

	}
	private void initTypeface() {

		Typeface grunge = Typeface.createFromAsset(getAssets(), "fonts/GurbaniAkhar.ttf");
		TextView titleText=(TextView) findViewById(R.id.splashscreen);
		titleText.setTypeface(grunge);




	}

}