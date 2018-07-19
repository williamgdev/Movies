package com.github.lossalvajes.data.repository

interface LocalDataSource {

    fun isExpired(): Boolean

    fun isCached(): Boolean
}