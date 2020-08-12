package com.ifyou.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private val isPlaying = "Media is Playing"

    private lateinit var player : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        try {
            if (player.isPlaying()){
                player.stop()
                player.release()
            }
        }catch (e : Exception){
            Toast.makeText(this,"Masuk Exception", Toast.LENGTH_LONG).show()
        }
        player =MediaPlayer.create(this,R.raw.bohong)
        player.setLooping(true)
        player.isLooping()
        player.start()

    }
}