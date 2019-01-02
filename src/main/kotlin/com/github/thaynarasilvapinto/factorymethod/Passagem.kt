package com.github.thaynarasilvapinto.factorymethod

import java.text.SimpleDateFormat
import java.util.*

//Produto
open class Passagem(
    private var origem: String? = null,
    private var destino: String? = null,
    private var dataHoraPartida: Calendar? = null
) {

    protected var df = SimpleDateFormat("dd/MM/yyyy HH:mm")

    open fun exibeDetalhes() : String = Unit.toString()
}