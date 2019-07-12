package com.wozader.phaseonechallenge

import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutALC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)

        alcWebView.settings.javaScriptEnabled = true
        alcWebView.settings.domStorageEnabled = true
        alcWebView.settings.useWideViewPort = true
        Toast.makeText(applicationContext,"Loading ...",Toast.LENGTH_LONG).show()
        alcWebView.loadUrl("http://andela.com/alc")

        alcWebView.webViewClient = object: WebViewClient(){
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler!!.proceed()

            }
        }


    }
}
