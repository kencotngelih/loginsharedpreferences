package com.robby.loginsharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val ivSplashScreen1 by lazy {this.findViewById<ImageView>(R.id.ivSplashScreen1)}
        val ivSplashScreen2 by lazy {this.findViewById<ImageView>(R.id.ivSplashScreen2)}
        Glide.with(this)
            .load("https://avatars.githubusercontent.com/u/13577897?v=4")
            .into(ivSplashScreen1)

        Glide.with(this)
            .load("https://kerjabilitas.com/user_image/user2/logo_7b6caab85699ca72e06917e9bad7512c.png")
            .into(ivSplashScreen2)

        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}