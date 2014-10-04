package com.example.dkalita;

import android.app.Application;
import android.util.Log;
import com.ubertesters.sdk.Ubertesters;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		Log.d("!!!", "onCreate");
		super.onCreate();
		Ubertesters.initialize(this);
	}

}
