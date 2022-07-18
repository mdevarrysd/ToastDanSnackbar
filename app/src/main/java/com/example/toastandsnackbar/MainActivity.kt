package com.example.toastandsnackbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSnackbar.setOnClickListener {

            val snackbar = Snackbar.make(binding.root, "Berhasil", Snackbar.LENGTH_INDEFINITE)
            // untuk menambah action
            snackbar.setAction("Retry") {
                Snackbar.make(binding.root, "Tekan ulang", Snackbar.LENGTH_SHORT).show()
            }.show()
        }

        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "Toast Di Pencet", Toast.LENGTH_SHORT).show()

        }
    }
}