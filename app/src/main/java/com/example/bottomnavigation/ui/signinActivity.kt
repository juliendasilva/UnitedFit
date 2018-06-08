package com.example.bottomnavigation.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.beust.klaxon.Klaxon
import com.example.bottomnavigation.R
import com.github.kittinunf.fuel.Fuel
import kotlinx.android.synthetic.main.activity_signin.*

class signinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        notValid.visibility = View.INVISIBLE

        previous!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, connectionActivity::class.java)
            startActivity(intent)
        })

        signin_button!!.setOnClickListener(View.OnClickListener {
            val name = nameInput.text.toString()
            val email = mailInput.text.toString()
            val password = passwordInput.text.toString()

            val path = "http://stark-temple-99246.herokuapp.com/signin?email=${email}&name=${name}&password=${password}"

            Fuel.post(path)
                    .responseString { request, response, result ->
                        result.fold({ d ->
                            class user (val email: String = "", val name: String = "", val password: String = "")
                            val result = Klaxon()
                                    .parse<user>(d)
                            var prefs = getSharedPreferences("com.example.bottomnavigation", MODE_PRIVATE)
                            prefs.edit().putString("name", result!!.name).commit()
                            prefs.edit().putString("email", result!!.email).commit()
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        }, { err ->
                            notValid.visibility = View.VISIBLE
                        })
                    }
        })
    }
}
