package com.aquario.enums

enum class TamanhoAquario(val nome: String, val abreviacao: String, val capacidadePeixes: Int) {
    PEQUENO(nome = "Pequeno", abreviacao = "P", capacidadePeixes = 5),
    MEDIO(nome = "Médio", abreviacao = "M", capacidadePeixes = 10),
    GRANDE(nome = "Grande", abreviacao = "G", capacidadePeixes = 15);
}