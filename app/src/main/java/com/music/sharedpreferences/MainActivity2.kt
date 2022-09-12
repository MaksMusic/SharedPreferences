package com.music.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.music.sharedpreferences.databinding.ActivityMain2Binding
import com.music.sharedpreferences.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var preferencManager: PreferencManager
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        preferencManager = PreferencManager(this)

        binding.button1.setOnClickListener(){
            binding.textView.text = preferencManager.getString("12345")
        }
    }
}