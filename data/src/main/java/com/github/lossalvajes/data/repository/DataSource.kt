package com.github.lossalvajes.data.repository

import com.github.lossalvajes.data.model.MovieEntity
import io.reactivex.Single

interface DataSource {
    fun getPopularMovies(): Single<List<MovieEntity>>
}