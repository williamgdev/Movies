package com.github.lossalvajes.data

import com.github.lossalvajes.data.repository.RemoteDataSource
import com.github.lossalvajes.data.source.DataSourceFactory
import com.github.lossalvajes.domain.models.Movie
import com.github.lossalvajes.domain.repository.Repository
import io.reactivex.Single
import org.buffer.android.boilerplate.data.mapper.MovieMapper
import javax.inject.Inject

class RepositoyImpl @Inject constructor(private val movieMapper: MovieMapper,
                                             private val factory: DataSourceFactory) : Repository{

    override fun getPopularMovies(): Single<List<Movie>> {
        var dataSource = factory.retrieveDataSource()
        return dataSource
                .getPopularMovies()
                .flatMap {
                    if(dataSource is RemoteDataSource){
                        //do save to database using function from LocalDataResource who responce type will e Completale rx ().tiSingle{ it }
                        Single.just(it)
                    }else{
                        Single.just(it)
                    }
                }
                .map { list ->
                    list.map { item
                        -> movieMapper.mapFromEntity(item)
                    }
        }
    }


}