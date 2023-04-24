package com.example.clase6marzo.models

import com.example.clase6marzo.R

class FakerVideojuegos {

    fun getVideogames() : ArrayList<Videojuego>{
        var videogames : ArrayList<Videojuego>
        videogames = arrayListOf<Videojuego>()

        videogames.add(Videojuego(1, "Perona 5", 1300F, "Nintendo Switch", R.drawable.persona5, "Teen"))
        videogames.add(Videojuego(2, "Halo Infinite", 1300F, "Xbox Series X/S", R.drawable.halo, "Mature"))
        videogames.add(Videojuego(3, "Persona3", 300F, "Psp", R.drawable.persona3, "Mature"))
        videogames.add(Videojuego(4, "Persona 4", 500F, "PS Vita", R.drawable.persona4, "Mature"))
        videogames.add(Videojuego(5, "Ori", 600F, "Nintendo Switch", R.drawable.ori, "Everyone"))
        videogames.add(Videojuego(6, "Zelda Breath of the wild", 1300F, "Nintendo Switch", R.drawable.zelda, "Everyone"))
        videogames.add(Videojuego(7, "Batman Arkaham Knight ", 400F, "", R.drawable.batman,"Mature"))
        videogames.add(Videojuego(8, "One Piece Pirate Warriors 4", 1000F, "Ps4", R.drawable.one, "Teen"))
        videogames.add(Videojuego(9, "Uncharted 4", 900F, "Ps4", R.drawable.uncharted, "Mature"))
        return videogames
    }

}