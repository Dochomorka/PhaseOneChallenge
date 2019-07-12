package com.wozader.phaseonechallenge

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutALC.setOnClickListener {
            val intent = Intent(applicationContext, AboutALC::class.java)
            startActivity(intent)
        }
        aboutProfile.setOnClickListener {
            val intent = Intent(applicationContext,AboutMe::class.java)
            startActivity(intent)
        }
    }
}
