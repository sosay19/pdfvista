package com.example.pdfvista.PresentationLayer.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pdfvista.R
import com.example.pdfvista.PresentationLayer.fragments.PDFDisplayFragment

class PDFReaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_reader)

        // Load the PDFDisplayFragment
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PDFDisplayFragment())
                .commit()
        }
    }
}
