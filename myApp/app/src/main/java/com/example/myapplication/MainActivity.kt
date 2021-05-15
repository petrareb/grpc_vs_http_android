package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.activity.ItemsGrpcActivity
import com.example.myapplication.activity.ItemsHttpActivity
import com.example.myapplication.utils.Constants

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val httpButton = findViewById<Button>(R.id.button_http_items)
        httpButton.setOnClickListener {
            val intent = Intent(this, ItemsHttpActivity::class.java)
            intent.putExtra(Constants.LOCALHOST, false)
            startActivity(intent)
        }

        val httpLocalhostButton = findViewById<Button>(R.id.button_http_localhost_items)
        httpLocalhostButton.setOnClickListener {
            val intent = Intent(this, ItemsHttpActivity::class.java)
            intent.putExtra(Constants.LOCALHOST, true)
            startActivity(intent)
        }

        val grpcButton = findViewById<Button>(R.id.button_grpc_items)
        grpcButton.setOnClickListener {
            val intent = Intent(this, ItemsGrpcActivity::class.java)
            startActivity(intent)
        }
    }
}