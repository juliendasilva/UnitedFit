package com.example.bottomnavigation.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.beust.klaxon.Klaxon
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_login.*
import com.github.kittinunf.fuel.*


class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        noCorrespondance.visibility = View.INVISIBLE

        previous!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, connectionActivity::class.java)
            startActivity(intent)
        })
        login_button!!.setOnClickListener(View.OnClickListener {
            val email = mailInput.text.toString()
            val password = passwordInput.text.toString()

            val path = "http://stark-temple-99246.herokuapp.com/login?email=${email}&password=${password}"

            Fuel.post(path)
                    .responseString { request, response, result ->
                result.fold({ d ->
                    class user (val email: String = "", val image: String = "", val name: String = "")
                    val result = Klaxon()
                            .parse<user>(d)
                    var prefs = getSharedPreferences("com.example.bottomnavigation", MODE_PRIVATE)
                    prefs.edit().putString("name", result!!.name).commit()
                    prefs.edit().putString("email", result!!.email).commit()
                    prefs.edit().putString("image", result!!.image).commit()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }, { err ->
                    noCorrespondance.visibility = View.VISIBLE
                })
            }
        })
    }
}
