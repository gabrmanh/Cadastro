package com.example.cadastro

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cadastro.databinding.ActivityMainBinding
import com.example.cadastro.domain.Genero
import com.example.cadastro.domain.UnidadeFederal
import com.example.cadastro.domain.Usuario

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        val unidadesFederais = mutableListOf<String>()
        UnidadeFederal.entries.forEach { unidadesFederais.add(it.toString()) }

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, unidadesFederais)
        amb.unidadeSp.adapter = adapter

        val emailList = mutableListOf<String>()

        amb.limparBt.setOnClickListener {
            limpar()
        }

        amb.salvarBt.setOnClickListener {
            val genero = findViewById<RadioButton>(amb.generoRg.checkedRadioButtonId).text.toString()
            val uf = amb.unidadeSp.selectedItem.toString()

            if(amb.emailCb.isChecked) emailList.add(amb.emailEt.text.toString())

            val user = Usuario(
                amb.nomeEt.text.toString(),
                amb.telefoneEt.text.toString(),
                amb.emailEt.text.toString(),
                Genero.fromRadio(genero),
                amb.cidadeEt.text.toString(),
                UnidadeFederal.valueOf(uf)
            )

            Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show()
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