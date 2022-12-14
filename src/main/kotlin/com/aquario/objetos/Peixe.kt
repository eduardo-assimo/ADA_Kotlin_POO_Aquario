package com.aquario.objetos

import com.aquario.enums.CorPeixe
import com.aquario.enums.TamanhoPeixe

data class Peixe(var nome: String, val cor: CorPeixe, val tamanho: TamanhoPeixe)
