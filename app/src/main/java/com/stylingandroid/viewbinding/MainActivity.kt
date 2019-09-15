package com.stylingandroid.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stylingandroid.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text1.text = getString(R.string.app_name)
    }
}
