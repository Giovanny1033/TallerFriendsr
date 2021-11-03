package com.example.tallerfriendsr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton = findViewById<Button>(R.id.btnSecondActivity)
        nextButton.setOnClickListener {
            goToSecondActivity()

        }
    }

    fun goToSecondActivity() {
        val secondIntent = Intent(this, SecondActivity::class.java)
        startActivity(secondIntent)
    }
}