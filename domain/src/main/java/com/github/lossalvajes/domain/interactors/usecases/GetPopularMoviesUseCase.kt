package com.github.lossalvajes.domain.interactors.usecases

import com.github.lossalvajes.domain.models.Movie
import com.github.lossalvajes.domain.repository.Repository
import io.reactivex.Single
import org.buffer.android.boilerplate.domain.executor.PostExecutionThread
import org.buffer.android.boilerplate.domain.executor.ThreadExecutor
import org.buffer.android.boilerplate.domain.interactor.SingleUseCase
import javax.inject.Inject

/**
 * Use case used for retreiving a [List] of [Bufferoo] instances from the [BufferooRepository]
 */
open class GetPopularMoviesUseCase @Inject constructor(val bufferooRepository: Repository,
                                                       threadExecutor: ThreadExecutor,
                                                       postExecutionThread: PostExecutionThread):
        SingleUseCase<List<Movie>, Void?>(threadExecutor, postExecutionThread) {

    public override fun buildUseCaseObservable(params: Void?): Single<List<Movie>> {
        return bufferooRepository.getPopularMovies()
    }

}