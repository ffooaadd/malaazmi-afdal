package com.example.malaazmiafdal;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ShareFeatureExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // مشاركة رابط تحميل
        String downloadUrl = "https://your-download-link.com";
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "تحميل الملزمة");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "رابط تحميل: " + downloadUrl);
        startActivity(Intent.createChooser(shareIntent, "مشاركة عبر"));
    }
}

