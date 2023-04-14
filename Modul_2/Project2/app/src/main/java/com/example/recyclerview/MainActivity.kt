package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.dokter,
                nameSuperhero = "dokter",
                descSuperhero = "Aku adalah dokter"
            ),
            Superhero(
                R.drawable.kontraktor,
                nameSuperhero = "kontraktor",
                descSuperhero = "Aku adalah kontraktor"
            ),
            Superhero(
                R.drawable.kacamata,
                nameSuperhero = "kacamata",
                descSuperhero = "Aku sedang memakai kacamata"
            ),
            Superhero(
                R.drawable.kumis,
                nameSuperhero = "kumis",
                descSuperhero = "Aku memiliki kumis"
            ),
            Superhero(
                R.drawable.peci,
                nameSuperhero = "peci",
                descSuperhero = "Aku sedang memakai peci"
            ),
            Superhero(
                R.drawable.wibu,
                nameSuperhero = "wibu",
                descSuperhero = "Aku punya teman wibu"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superherolist){

        }
    }
}