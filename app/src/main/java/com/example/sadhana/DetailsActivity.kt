package com.example.sadhana

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sadhana.Entity
import com.example.test8.R

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        // Retrieve the entity from the intent
        val entity: Entity? = intent.getParcelableExtra("ENTITY")

        // Find views
        val artistName: TextView = findViewById(R.id.artistName)
        val albumTitle: TextView = findViewById(R.id.albumTitle)
        val releaseYear: TextView = findViewById(R.id.releaseYear)
        val genre: TextView = findViewById(R.id.genre)
        val trackCount: TextView = findViewById(R.id.trackCount)
        val popularTrack: TextView = findViewById(R.id.popularTrack)
        val description: TextView = findViewById(R.id.description)


        // Set text from the entity
        artistName.text = "species: ${entity?.species}"
        albumTitle.text = "scientificName: ${entity?.scientificName}"
        releaseYear.text = "habitat: ${entity?.habitat}"
        genre.text = "diet: ${entity?.diet}"
        trackCount.text = "conservation: ${entity?.conservationStatus}"
        popularTrack.text = "averageLifespan: ${entity?.averageLifespan}"
        description.text = "Description: ${entity?.description}"

        // Set up back button click listener

    }
}
