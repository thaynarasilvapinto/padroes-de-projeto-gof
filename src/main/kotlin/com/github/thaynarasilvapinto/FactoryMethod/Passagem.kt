package com.github.thaynarasilvapinto.FactoryMethod

import java.text.SimpleDateFormat
import java.util.*

//Produto
open class Passagem(
    private var origem: String? = null,
    private var destino: String? = null,
    private var dataHoraPartida: Calendar? = null
) {

    protected var df = SimpleDateFormat("dd/MM/yyyy HH:mm")

    fun Passagem(origem: String, destino: String, dataHoraPartida: Calendar) {
        this.origem = origem
        this.destino = destino
        this.dataHoraPartida = dataHoraPartida
    }

    open fun exibeDetalhes() : String = Unit.toString()
}