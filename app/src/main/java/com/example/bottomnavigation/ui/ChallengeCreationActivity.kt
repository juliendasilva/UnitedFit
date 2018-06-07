package com.example.bottomnavigation.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_challenge_creation.*

class ChallengeCreationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_creation)

        back_arrow.setOnClickListener(View.OnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }
}
