package com.example.cadastro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        amb.limparBt.setOnClickListener {
            limpar()
        }

        amb.salvarBt.setOnClickListener {

        }
    }

    private fun limpar() {
        amb.nomeEt.text.clear()
        amb.telefoneEt.text.clear()
        amb.emailEt.text.clear()
        if (amb.emailCb.isChecked) amb.emailCb.toggle()
        amb.generoRg.clearCheck()
        amb.cidadeEt.text.clear()
    }
}