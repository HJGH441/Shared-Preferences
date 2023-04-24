package com.example.clase6marzo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clase6marzo.adapters.VideojuegoAdapter
import com.example.clase6marzo.models.FakerVideojuegos
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.recyclerview.widget.GridLayoutManager


class ListaGamesActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: VideojuegoAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_games)
        val juegos = FakerVideojuegos().getVideogames()
        recyclerView = findViewById(R.id.RecyclerJuegos)
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager


        val Cantidad_Columnas = 2
        var administradorDeLayouts = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = administradorDeLayouts
        recyclerView.adapter = VideojuegoAdapter(juegos,this)

        val fabPreferencias = findViewById<FloatingActionButton>(R.id.fabPreferencias)

        fabPreferencias.setOnClickListener {
            val s = Intent(this, MostrarPreferencias::class.java)
            startActivity(s)
            finish()
        }


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_vertical -> {
                // Se cambia a un LinearLayoutManager vertical
                layoutManager = LinearLayoutManager(this)
                recyclerView.layoutManager = layoutManager
            }
            R.id.menu_horizontal -> {
                // Se cambia a un LinearLayoutManager horizontal
                layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
                recyclerView.layoutManager = layoutManager
            }
            R.id.menu_grid_2 -> {
                // Se cambia a un GridLayoutManager con 2 columnas
                layoutManager = GridLayoutManager(this, 2)
                recyclerView.layoutManager = layoutManager
            }
            R.id.menu_grid_3 -> {
                // Se cambia a un GridLayoutManager con 3 columnas
                layoutManager = GridLayoutManager(this, 3)
                recyclerView.layoutManager = layoutManager
            }
        }

        return super.onOptionsItemSelected(item)
    }
}