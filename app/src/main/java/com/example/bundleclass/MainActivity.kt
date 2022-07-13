package com.example.bundleclass

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent
import android.os.Bundle;
import android.util.Log
import android.view.View;
import android.widget.Button;
import android.widget.EditText
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    var data: String = "Hello"
    val resultLauncher  = registerForActivityResult(ActivityResultContracts.StartActivityForResult())
    {
        if (it.resultCode == Activity.RESULT_OK) {
            data = it.data?.getStringExtra("keyMain2").toString()
            Log.d("BACK","Data: "+data)
        }
    }

    val resultLauncher3  = registerForActivityResult(ActivityResultContracts.StartActivityForResult())
    {
        if (it.resultCode == Activity.RESULT_OK) {
            data = it.data?.getStringExtra("keyMain3").toString()
            Log.d("BACK","Data: "+data)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val edt1 = findViewById<EditText>(R.id.edt1)
        val edt2 = findViewById<EditText>(R.id.edt2)

        btn1.setOnClickListener() {
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("name", edt1.text.toString())
            bundle.putString("addr", edt2.text.toString())

            intent.putExtras(bundle)
//            startActivity(intent)
            resultLauncher.launch(intent)
        }


        btn2.setOnClickListener(){
            val intent3 = Intent(this, MainActivity3::class.java)
            resultLauncher3.launch(intent3)
        }
    }
}