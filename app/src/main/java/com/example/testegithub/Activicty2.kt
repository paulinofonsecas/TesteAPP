package com.example.testegithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activicty2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activicty2)
    }

    override fun finish() {
        super.finish()
//        overridePendingTransition( R.anim.slede_in_left, R.anim.slede_out_right )
    }

    fun abrirActivity3(view: View){
        startActivity(Intent(this, Activity3::class.java))
//        overridePendingTransition(R.anim.slede_in_right, R.anim.slede_out_left)
    }

}
