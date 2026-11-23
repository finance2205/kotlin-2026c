package com.appweek06

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        val buttonGreet = findViewById<Button>(R.id.buttonGreet)
        val buttonCount = findViewById<Button>(R.id.buttonCounter)
        val buttonColor = findViewById<Button>(R.id.buttonColor)

        buttonColor.setOnClickListener {
            startActivity(Intent(this, ColorActivity::class.java))
        }

        buttonGreet.setOnClickListener {
            startActivity(Intent(this, GreetingActivity::class.java))
        }

        buttonCount.setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
        }
    }
}
