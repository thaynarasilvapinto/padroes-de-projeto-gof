package com.github.thaynarasilvapinto.abstractfactory

import java.util.*

open class ConcreteEmpresaOnibus : EmpresaOnibus() {

    override fun emitePassagemOnibusUrbano(
        origem: String,
        destino: String,
        dataHoraPartida: Calendar
    ): ConcretePassagemOnibusUrbano {
        return ConcretePassagemOnibusUrbano(
            origem,
            destino,
            dataHoraPartida
        )
    }


    override fun emitePassagemOnibusInterestadual(
        origem: String,
        destino: String,
        dataHoraPartida: Calendar
    ): ConcretePassagemOnibusInterestadual {
        return ConcretePassagemOnibusInterestadual(
            origem,
            destino,
            dataHoraPartida
        )
    }
}
