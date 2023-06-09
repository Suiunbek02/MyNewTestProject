package com.example.mynewtestproject.model


import com.example.mynewtestproject.base.IBaseDiffutils
import com.google.gson.annotations.SerializedName

data class FilmModel(

    @SerializedName("id")
    override var id: String,

    @SerializedName("title")
    var title: String,

    @SerializedName("image")
    val image: String,

    @SerializedName("description")
    var description: String,

    @SerializedName("director")
    var director: String,

    @SerializedName("producer")
    var producer: String,

    @SerializedName("release_date")
    var releaseDate: String,

    @SerializedName("running_time")
    var runningTime: String,

    @SerializedName("rt_score")
    var rtScore: String,

    ) : IBaseDiffutils

fun FilmModel.toDomain() = FilmModel(
    id = id,
    title = title,
    image = image,
    director = director,
    producer = producer,
    releaseDate = releaseDate,
    runningTime = runningTime,
    rtScore = rtScore,
    description = description,
)