package com.example.mad_practical4_21012021042

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_register)

        val regbtn=findViewById<Button>(R.id.regbtn)
        regbtn.setOnClickListener{
            val intent7= Intent (this,MainActivity::class.java)
            startActivity(intent7)
        }
    }
}
