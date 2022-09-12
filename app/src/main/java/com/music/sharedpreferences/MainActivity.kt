package com.music.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.music.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var preferencManager: PreferencManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        preferencManager = PreferencManager(this)

        setContentView(binding.root)

        binding.btnSave.setOnClickListener() {
            preferencManager.putString("12345",binding.editText.text.toString())

        }

        binding.btn.setOnClickListener(){
            startActivity(Intent(this,MainActivity2::class.java))
        }


    }
}