package com.example.bundleclass

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)

        textView1.text = bundle!!.getString("name","no name")
        textView2.text = bundle.getString("addr","no addr")

        val btnBack = findViewById<Button>(R.id.buttonBack2)

        btnBack.setOnClickListener(){
            intent.putExtra("keyMain2","Hello main 2")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }
}