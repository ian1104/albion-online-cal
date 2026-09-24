package com.ian1104.albioncal;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        WebView web = new WebView(this);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setBuiltInZoomControls(false);
        web.setWebViewClient(new WebViewClient());
        web.setBackgroundColor(0xFF0D1117);
        web.loadUrl("file:///android_asset/index.html");
        setContentView(web);
    }
    @Override public void onBackPressed() { super.onBackPressed(); }
}
