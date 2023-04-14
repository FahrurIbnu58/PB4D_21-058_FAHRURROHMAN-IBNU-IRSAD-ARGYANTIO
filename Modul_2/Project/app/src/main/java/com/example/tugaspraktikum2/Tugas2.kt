package com.example.tugaspraktikum2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Tugas2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas2)

        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)

        btn2.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener() {
            Toast.makeText(this, "Anggota Telah Dikeluarkan", Toast.LENGTH_SHORT).show()
        }

        btn4.setOnClickListener() {
            Toast.makeText(this, "Anggota Telah Dikeluarkan", Toast.LENGTH_SHORT).show()
        }
    }
}