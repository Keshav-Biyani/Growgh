package com.keshav.internproject.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.keshav.internproject.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val startAct = Intent(this, LoginActivity::class.java)
            startActivity(startAct)
        }, 2000)
    }
    override fun onPause() {
        super.onPause()
        finish()
    }

}