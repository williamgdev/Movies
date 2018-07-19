package com.github.lossalvajes.domain.repository


import com.github.lossalvajes.domain.models.Movie
import io.reactivex.Single

/**
 * Created by alexk on 05.05.17.
 */
interface Repository {

    fun getPopularMovies(): Single<List<Movie>>
}