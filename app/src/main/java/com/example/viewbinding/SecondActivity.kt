package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_second)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.tvSecondactivity.setText()

        val bundle: Bundle? = intent.extras  //Extract incomimg string value
        val msg= bundle!!.getString("user_message")

        binding.tvSecondactivity.text = msg


    }
}