package com.codepath.flixsterplusnext

import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class Movie (
//    @JvmField
    @SerializedName("title")
    var title : String?,

    @SerializedName("overview")
    var description : String?,

    @SerializedName("release_date")
    var releaseDate : String?,

    @SerializedName("vote_average")
    var voteAverage : Double?,

    @SerializedName("poster_path")
    var movieImageUrl : String?,
) : java.io.Serializable