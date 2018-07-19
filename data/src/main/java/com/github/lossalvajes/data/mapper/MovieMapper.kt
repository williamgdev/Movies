package org.buffer.android.boilerplate.data.mapper

import com.github.lossalvajes.data.model.MovieEntity
import com.github.lossalvajes.data.model.PopularMoviesEntity
import com.github.lossalvajes.domain.models.Movie
import javax.inject.Inject


/**
 * Map a [BufferooEntity] to and from a [Bufferoo] instance when data is moving between
 * this later and the Domain layer
 */
open class MovieMapper @Inject constructor(): Mapper<MovieEntity, Movie> {
    override fun mapFromEntity(type: MovieEntity): Movie {
        return Movie(type.overview, type.originalLanguage, type.originalTitle, type.video, type.title, type.genreIds, type.posterPath, type.backdropPath, type.releaseDate,
                type.voteAverage, type.popularity, type.id, type.adult, type.voteCount)
    }

    override fun mapToEntity(type: Movie): MovieEntity {
        return MovieEntity(type.overview, type.originalLanguage, type.originalTitle, type.video, type.title, type.genreIds, type.posterPath, type.backdropPath, type.releaseDate,
                type.voteAverage, type.popularity, type.id, type.adult, type.voteCount)
    }


}