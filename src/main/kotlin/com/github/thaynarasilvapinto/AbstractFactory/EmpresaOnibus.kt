package com.github.thaynarasilvapinto.AbstractFactory

import java.util.*

abstract class EmpresaOnibus {

    abstract fun emitePassagemOnibusUrbano(
        origem: String,
        destino: String,
        dataHoraPartida: Calendar
    ): ConcretePassagemOnibusUrbano

    abstract fun emitePassagemOnibusInterestadual(
        origem: String,
        destino: String,
        dataHoraPartida: Calendar
    ): ConcretePassagemOnibusInterestadual

}