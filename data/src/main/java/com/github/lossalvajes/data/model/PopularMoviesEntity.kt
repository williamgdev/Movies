package com.github.lossalvajes.data.model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class PopularMoviesEntity(

		@field:SerializedName("page")
	val page: Int? = null,

		@field:SerializedName("total_pages")
	val totalPages: Int? = null,

		@field:SerializedName("results")
	val results: List<MovieEntity?>? = null,

		@field:SerializedName("total_results")
	val totalResults: Int? = null
)