package com.example.testegithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            YoYo.with(Techniques.Shake)
                    .duration(700)
                    .repeat(YoYo.INFINITE)
                    .playOn(texto_animar)
        }

        btn.callOnClick()

    }
}
