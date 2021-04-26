package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.activity.ItemsHttpActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val httpButton = findViewById<Button>(R.id.button_http_items)
        httpButton.setOnClickListener {
            val intent = Intent(this, ItemsHttpActivity::class.java)
            startActivity(intent)
        }
    }
}