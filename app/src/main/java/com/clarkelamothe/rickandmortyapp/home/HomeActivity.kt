package com.clarkelamothe.rickandmortyapp.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.clarkelamothe.rickandmortyapp.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}