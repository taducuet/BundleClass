package com.example.bundleclass

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnBack3 = findViewById<Button>(R.id.buttonBack3)

        btnBack3.setOnClickListener(){
//            val intentBack3 = Intent(this, MainActivity::class.java)
//            startActivity(intentBack3)
            intent.putExtra("keyMain3","Hello main 3")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}