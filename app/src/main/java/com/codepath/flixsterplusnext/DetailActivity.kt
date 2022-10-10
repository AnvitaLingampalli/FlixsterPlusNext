package com.codepath.flixsterplusnext

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity(){
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var abstractTextView: TextView
    private lateinit var voteTextView: TextView
    private lateinit var dateTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        mediaImageView = findViewById(R.id.mediaImage)
        titleTextView = findViewById(R.id.mediaTitle)
        abstractTextView = findViewById(R.id.mediaAbstract)
        voteTextView = findViewById(R.id.mediaVoteAvg)
        dateTextView = findViewById(R.id.releaseDate)

        // TODO: Get the extra from the Intent
        val movie = intent.getSerializableExtra(MOVIE_EXTRA) as Movie

        titleTextView.text = movie.title
        abstractTextView.text = movie.description
        voteTextView.text = movie.voteAverage.toString()
        dateTextView.text = movie.releaseDate
        Log.d("DebugDetailActivity-title", titleTextView.text.toString())
        Log.d("DebugDetailActivity-abstract", titleTextView.text.toString())
        // TODO: Load the media image
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/"+movie.movieImageUrl)
            .into(mediaImageView)
    }
}

