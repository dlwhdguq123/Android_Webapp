package com.example.webapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.index);
        //WebView webView = findViewById(R.id.webView);
        //webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("https://www.naver.com/");
        Context _this = Index.this;
        LinearLayout frame = new LinearLayout(_this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        frame.setLayoutParams(params);
        WebView webView = new WebView(_this);
        webView.setLayoutParams(params);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/html/index.html");
        frame.addView(webView);
        setContentView(frame);
    }
}
