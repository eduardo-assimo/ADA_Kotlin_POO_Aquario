package com.aquario.principal

import com.aquario.enums.CorPeixe
import com.aquario.enums.TamanhoAquario
import com.aquario.enums.TamanhoPeixe
import com.aquario.objetos.Aquario
import com.aquario.objetos.Peixe

fun main() {
    val aquario = Aquario()
    println("O tamanho inicial do aquário é ${aquario.tamanhoAquario}, nele cabem ${aquario.tamanhoAquario.capacidadePeixes} peixes.")
    println(aquario.estadoDoAquario())
   // println(aquario.limiteAquarioLimpo)


    val peixe1 = Peixe("Tilápia", cor = CorPeixe.AZUL, tamanho = TamanhoPeixe.PEQUENO)

    val peixe2 = Peixe("Atum", cor = CorPeixe.VERMELHO, tamanho = TamanhoPeixe.MEDIO)

    val peixe3 = Peixe("Bacalhau", cor = CorPeixe.AMARELO, TamanhoPeixe.GRANDE)

    val peixe4 = Peixe("Sardinha", cor = CorPeixe.AMARELO, tamanho = TamanhoPeixe.PEQUENO)

    val peixe5 = Peixe("Corvina", cor = CorPeixe.AZUL, tamanho = TamanhoPeixe.MEDIO)

    val peixe6 = Peixe("Dourado", cor = CorPeixe.AMARELO, tamanho = TamanhoPeixe.GRANDE)

    val peixe7 = Peixe ("Vermelho", cor = CorPeixe.VERMELHO, tamanho = TamanhoPeixe.MEDIO)


    aquario.adicionarPeixe(peixe1)
    aquario.adicionarPeixe(peixe2)
    aquario.adicionarPeixe(peixe3)
    aquario.adicionarPeixe(peixe4)

    aquario.consultaPeixes()

    aquario.limpaAquario()

    aquario.alimentaPeixes()

    aquario.alteraRegraLimpeza(5)

    aquario.adicionarPeixe(peixe4)
    aquario.adicionarPeixe(peixe5)
    aquario.adicionarPeixe(peixe6)

    aquario.consultaPeixes()

    aquario.upgradeAquario(TamanhoAquario.MEDIO)

    aquario.limpaAquario()

    aquario.alimentaPeixes()

    aquario.adicionarPeixe(peixe6)
    aquario.adicionarPeixe(peixe7)

    aquario.consultaPeixes()
}