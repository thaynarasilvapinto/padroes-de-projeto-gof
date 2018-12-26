package com.github.thaynarasilvapinto.abstractfactory

import java.text.SimpleDateFormat
import java.util.*

abstract class PassagemOnibusInterestadual(
    var origem: String,
    var destino: String,
    var dataHoraPartida: Calendar
) {
    protected var df = SimpleDateFormat("dd/MM/yyyy HH:mm")

    open fun exibeDetalhes(): String = Unit.toString()
}