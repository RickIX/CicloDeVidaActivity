package com.example.ciclodevidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val senhaEditText = findViewById<EditText>(R.id.editTextTextPassword)
        emailEditText.text.clear()
        senhaEditText.text.clear()
    }



    fun login(view: View) {
        val emailCerto = "email@gmail.com"
        val senhaCerta = "positivo5"

        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val senhaEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val email = emailEditText.text.toString()
        val senha = senhaEditText.text.toString()
        val intent = Intent(this, Home::class.java)

        if (email == emailCerto && senha == senhaCerta) {
            startActivity(intent)
        }
    }
}
