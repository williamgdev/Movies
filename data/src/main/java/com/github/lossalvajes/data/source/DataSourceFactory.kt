package com.github.lossalvajes.data.source

import com.github.lossalvajes.data.repository.DataSource
import com.github.lossalvajes.data.repository.LocalDataSource
import javax.inject.Inject

open class DataSourceFactory @Inject constructor(private val localDataSource: LocalDataSource,
                                                 private val localDataSourceImpl: LocalDataSourceImpl,
                                                 private val remoteDataSourceImpl: RemoteDataSourceImpl) {

    open fun retrieveDataSource(): DataSource {
        if (localDataSource.isCached() && !localDataSource.isExpired()) {
            return localDataSourceImpl
        }
        return remoteDataSourceImpl

    }

    open fun retrieveLocalDataSource(): DataSource {
        return localDataSourceImpl
    }

    open fun retrieveRemoteDataSource(): DataSource {
        return remoteDataSourceImpl
    }

}