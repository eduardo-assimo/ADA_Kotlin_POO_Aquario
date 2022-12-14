package com.aquario.objetos

import com.aquario.enums.TamanhoAquario
import java.util.*
import kotlin.random.Random

class Aquario() {
    var tamanhoAquario: TamanhoAquario = TamanhoAquario.PEQUENO
    var limiteAquarioLimpo: Int = 3
    var isAquarioLimpo: Boolean = true
    val listaPeixes: MutableList<Peixe> = mutableListOf()

    fun estadoDoAquario(): String {
       return if (isAquarioLimpo) {
            "O aquário se encontra limpo."
        }
        else {
           "O aquário se encontra sujo."
        }
    }

    fun consultaPeixes() {
        print("O aquário atualmente contém os seguintes peixes: ")
        listaPeixes.iterator().forEach {
            print("${it.nome.uppercase(Locale.getDefault())} ")
        }
        println()
    }

    fun adicionarPeixe(peixe: Peixe) {
        when (isAquarioLimpo) {
            true -> {
                if(listaPeixes.size < tamanhoAquario.capacidadePeixes) {
                    listaPeixes.add(peixe)
                    isAquarioLimpo=!(listaPeixes.size%limiteAquarioLimpo == 0 && listaPeixes.isNotEmpty())
                    println("Um peixe foi adicionado no aquário!")
                }
                else {
                  println("O aquário atingiu a capacidade máxima de peixes, não é possível adicionar mais peixes.")
                }
            }
            false -> {
                println("O aquário está sujo, limpe o aquário antes de adicionar mais peixes.")
            }
        }
    }

    fun limpaAquario() {
        when (isAquarioLimpo) {
            true -> println("O aquário já se encontra limpo. Não é necessário limpá-lo agora.")
            false -> {
                isAquarioLimpo = true
                println("O aquário foi limpo!")
            }
        }
    }

    fun alimentaPeixes() {
        when(val valorRandomico: Int = Random.nextInt(listaPeixes.size+1)) {
            0 -> println("*Falha*, nenhum peixe se alimentou.")
            listaPeixes.size -> println("*Sucesso*, todos os peixes se alimentaram.")
            else -> println("*Parcial*, alguns peixes se alimentaram ($valorRandomico).")
        }
    }

    fun upgradeAquario(novoTamanhoAquario: TamanhoAquario) {
        if(tamanhoAquario.capacidadePeixes < novoTamanhoAquario.capacidadePeixes) {
            tamanhoAquario = novoTamanhoAquario
            println("Você trocou seu aquário por um maior com mais capacidade para peixes. Parabéns!")
        }
        else {
            println("Não foi possível fazer um upgrade no seu aquário.")
        }
    }

    fun alteraRegraLimpeza(novoLimiteAquarioLimpo: Int) {
        limiteAquarioLimpo = novoLimiteAquarioLimpo
    }
}