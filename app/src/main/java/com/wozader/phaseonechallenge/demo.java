package com.wozader.phaseonechallenge;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.appcompat.app.AppCompatActivity;

public class demo extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(getApplicationContext(),AboutALC.class);
        intent.setData(Uri.parse("https://www.google.com/"));
        startActivity(intent);
    }
}
