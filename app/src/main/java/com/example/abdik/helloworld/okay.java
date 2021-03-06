package com.example.abdik.helloworld;

import android.app.Activity;
import android.provider.Browser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;



public class okay extends AppCompatActivity {


    private Button mBtGoBack;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okay);


        //first solution. Works, but takes to external link.
        webView = (WebView) findViewById(R.id.WebView1);

        webView.setWebViewClient(new MyBrowser());
        String url = "https://www.wikihow.com/Find-a-Hobby";
        webView.getSettings().getLoadsImagesAutomatically();
        webView.getSettings().getJavaScriptEnabled();
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);

        mBtGoBack = (Button) findViewById(R.id.bt_go_back);

        mBtGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }

    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }






}
