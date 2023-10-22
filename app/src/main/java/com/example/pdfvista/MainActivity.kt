package com.example.pdfvista

import android.os.Bundle
import androidx.activity.ComponentActivity

import android.content.Intent
import com.example.pdfvista.PresentationLayer.activities.PDFReaderActivity  // Replace with the correct package name

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, PDFReaderActivity::class.java)
        startActivity(intent)
    }
}
