package com.example.activitykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var goToButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToButton = findViewById(R.id.button_goto_act)

        goToButton.setOnClickListener {
//            this actually means go to second activity
//            val intent = Intent(this@MainActivity, SecondActivity::class.java)
//            startActivity(intent)

            Intent(this@MainActivity, SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }

//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(this@MainActivity, "onStart called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(this@MainActivity, "onResume called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(this@MainActivity, "onPause called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Toast.makeText(this@MainActivity, "onStop called", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(this@MainActivity, "onDestroy called", Toast.LENGTH_SHORT).show()
//    }
}