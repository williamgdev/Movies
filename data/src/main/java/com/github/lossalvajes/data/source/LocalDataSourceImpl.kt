package com.github.lossalvajes.data.source

import com.github.lossalvajes.data.model.MovieEntity
import com.github.lossalvajes.data.repository.DataSource
import com.github.lossalvajes.data.repository.LocalDataSource
import io.reactivex.Single
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(private val localDataSource: LocalDataSource) : DataSource {
    override fun getPopularMovies(): Single<List<MovieEntity>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}