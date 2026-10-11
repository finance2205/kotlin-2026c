package com.appweek06

import android.os.Bundle
<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent
=======
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
>>>>>>> week06/color-changer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        setContentView(R.layout.activity_main)

        val buttonGreet = findViewById<Button>(R.id.buttonGreet)
        val buttonCount = findViewById<Button>(R.id.buttonCounter)

        buttonGreet.setOnClickListener {
            startActivity(Intent(this, GreetingActivity::class.java))
        }
        buttonCount.setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
=======
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
>>>>>>> week06/color-changer
        }
    }
}