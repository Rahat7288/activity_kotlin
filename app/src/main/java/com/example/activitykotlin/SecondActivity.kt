package com.example.activitykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textViewData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        textViewData = findViewById(R.id.textViewData)

//        getting data from first screen

        val data = intent.extras

        data?.let {
            val message = data.getString(Constants.INTENT_MESSEGE_KEY)
            val message2 = data.getString(Constants.INTENT_MESSAGE2_KEY)
            val  number = data.getDouble(Constants.INTENT_DATA_NUMBER)
            textViewData.text = message + "\n"+ message2 + "\n" + number
        }

    }
}