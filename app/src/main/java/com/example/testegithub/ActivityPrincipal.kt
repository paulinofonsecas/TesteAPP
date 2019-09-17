package com.example.testegithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }

    fun abrirActivity2(view: View){
        startActivity(Intent(this, Activicty2::class.java))
//        overridePendingTransition(R.anim.slede_in_right, R.anim.slede_out_left)
    }

}
