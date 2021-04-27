package com.example.quiz_expert

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


    }

    override fun onBackPressed() {

        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
       // super.onBackPressed()
    }
}