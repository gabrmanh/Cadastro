package com.example.cadastro.domain

class Usuario(
    var nome: String?,
    var telefone: String?,
    var email: String?,
    var genero: Genero?,
    var cidade: String?,
    var unidadeFederal: UnidadeFederal?
) {
    override fun toString(): String {
        return "Usuario(nome=$nome, telefone=$telefone, email=$email, genero=$genero, cidade=$cidade, unidadeFederal=$unidadeFederal)"
    }
}