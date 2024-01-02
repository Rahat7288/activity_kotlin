package com.example.activitykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private lateinit var goToButton: Button
    private  lateinit var textViewResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode == Constants.RESULT_Code){
                val message = it.data!!.getStringExtra(Constants.INTENT_MESSAGE2_KEY)
                textViewResult.text = message

            }
        }

        goToButton = findViewById(R.id.button_goto_act)
        textViewResult = findViewById(R.id.textView)


        goToButton.setOnClickListener {
//            this actually means go to second activity
            val intent = Intent(this@MainActivity, SecondActivity::class.java)


            intent.putExtra(Constants.INTENT_MESSEGE_KEY,  "hello from first Activity")
            intent.putExtra(Constants.INTENT_MESSAGE2_KEY, "How was your day!")
            intent.putExtra(Constants.INTENT_DATA_NUMBER, 3.14)
            getResult.launch(intent)
//            startActivity(intent)

//            Intent(this@MainActivity, SecondActivity::class.java).also {
//                startActivity(it)
//            }
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