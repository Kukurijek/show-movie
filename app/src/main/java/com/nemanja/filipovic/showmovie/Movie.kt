package com.nemanja.filipovic.showmovie

data class Movie (
    var title: String,
    var description: String,
    var rating: Float,
    var genres: String?,
    var creatorsAuthors: String,
    var actors: String
)
