package com.example.cadastro.domain

enum class Genero(val valor: String) {
    HOMEM("Homem"),
    MULHER("Mulher"),
    NAOBINARIO("Não-binário"),
    OUTRO("Outro");

    companion object {
        fun fromRadio(radioValue: String): Genero? {
            return when (radioValue) {
                "Homem" -> HOMEM
                "Mulher" -> MULHER
                "Não-binário" -> NAOBINARIO
                "Outro" -> OUTRO
                else -> null
            }
        }
    }
}