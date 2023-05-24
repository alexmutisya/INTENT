package com.sealteam.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.nio.file.Files.move

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginbtn=findViewById<Button>(R.id.login)
        val sigupbt=findViewById<Button>(R.id.signup)
        loginbtn.setOnClickListener {
            val x=Intent(this,home::class.java)
startActivity(x)}
sigupbt.setOnClickListener {
val y=Intent(this,register::class.java)
startActivity(y)}
}}