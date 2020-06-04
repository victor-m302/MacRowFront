package com.hyper.macfei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btn1 = findViewById<TextView>(R.id.criar_conta) as TextView
        val loginbtn = findViewById<Button>(R.id.login_btn) as Button

        btn1.setOnClickListener {

            val intent = Intent(this, NewAccActivity::class.java)
            startActivity(intent)
            finish()
        }

        loginbtn.setOnClickListener {

            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
            finish()
        }

    }
}
