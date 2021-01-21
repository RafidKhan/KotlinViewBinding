package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)


        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClickme.setOnClickListener()
        {
            Toast.makeText(applicationContext,"Clicked", Toast.LENGTH_LONG).show()

            binding.tvShow.setText(binding.editName.text)
        }

        binding.btnSecondActivity.setOnClickListener()
        {
            var message: String = binding.editName.text.toString()
            intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }

    }
}