package com.nemanja.filipovic.showmovie

data class Movie (
    var title: String = "Catch me if you can",
    var description: String = "Drama",
    var rating: Float = 3.7182818284f,
    var genres: String? = null,
    var creatorsAuthors: String = "Steven Spielberg;",
    var actors: String = "Leonardo DiCaprio"
)
