package com.hyper.macfei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val btn1 = findViewById<TextView>(R.id.criar_conta) as TextView

        btn1.setOnClickListener {

            val intent = Intent(this, NewAccActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
