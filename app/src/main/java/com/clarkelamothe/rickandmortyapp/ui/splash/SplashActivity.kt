package com.clarkelamothe.rickandmortyapp.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.clarkelamothe.rickandmortyapp.home.HomeActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1_000)
        startActivity(Intent(this, HomeActivity::class.java))
    }
}