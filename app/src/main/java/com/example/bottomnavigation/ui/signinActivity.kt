package com.example.bottomnavigation.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_signin.*

class signinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        previous!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, connectionActivity::class.java)
            startActivity(intent)
        })
    }
}
