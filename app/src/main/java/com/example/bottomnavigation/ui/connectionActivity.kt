package com.example.bottomnavigation.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_connection.*

class connectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connection)

        login!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        })

        signin!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, signinActivity::class.java)
            startActivity(intent)
        })
    }
}
