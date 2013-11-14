package com.example.view;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Webview example that shows how to add street view to your app from
 * an HTML file at the assets/ dir
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webView = (WebView) findViewById(R.id.view);
		  webView.getSettings().setJavaScriptEnabled(true);
		  webView.setWebViewClient(new WebViewClient());
		  webView.loadUrl( "file:///android_asset/mapa.html");
	}
}
