package com.github.thaynarasilvapinto.AbstractFactory

import java.util.*

abstract class ConcreteEmpresaOnibus : EmpresaOnibus() {

    override fun emitePassagemOnibusUrbano(
        origem: String,
        destino: String,
        dataHoraPartida: Calendar
    ): ConcretePassagemOnibusUrbano {
        return ConcretePassagemOnibusUrbano(origem, destino, dataHoraPartida)
    }


    override fun emitePassagemOnibusInterestadual(
        origem: String,
        destino: String,
        dataHoraPartida: Calendar
    ): ConcretePassagemOnibusInterestadual {
        return ConcretePassagemOnibusInterestadual(origem, destino, dataHoraPartida)
    }
}
