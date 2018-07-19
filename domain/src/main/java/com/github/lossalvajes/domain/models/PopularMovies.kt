package com.github.lossalvajes.domain.models


data class PopularMovies(val page: Int? = null, val totalPages: Int? = null, val results: List<Movie?>? = null,val totalResults: Int? = null)