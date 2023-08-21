package com.example.mad_practical4_21012021042

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)


        val button_login=findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener{
            val intent6=Intent(this,MainActivity::class.java)
            startActivity(intent6)
        }
    }
}
