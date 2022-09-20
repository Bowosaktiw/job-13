package com.example.jobb13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var namaView: TextView
    private lateinit var kelasView: TextView
    private lateinit var nisView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        namaView = findViewById(R.id.namaView)
        kelasView = findViewById(R.id.kelasView)
        nisView = findViewById(R.id.nisView)
        val extras = intent.extras
        namaView.text = extras?.getString("nama")
        kelasView.text = extras?.getString("kelas")
        nisView.text = extras?.getString("nis")
    }
}