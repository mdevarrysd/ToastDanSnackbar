package com.example.toastandsnackbar

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.musfickjamil.snackify.Snackify
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.suksesBtn.setOnClickListener {
            MotionToast.Companion.createToast(
                this, "Please fill all the details!",
                "Erorr",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this, R.font.helvetica_regular)
            )
        }

        findViewById<Button>(R.id.btnInfo).setOnClickListener {
            Snackify.info(
                findViewById(android.R.id.content),
                "Info message !",
                Snackify.LENGTH_LONG
            ).show()
        }

    }
}