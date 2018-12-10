package com.github.thaynarasilvapinto.AbstractFactory

import java.util.*

class ConcretePassagemOnibusInterestadual(
    origem: String,
    destino: String,
    dataHoraPartida: Calendar
) : PassagemOnibusInterestadual(origem, destino, dataHoraPartida) {

    override fun exibeDetalhes(): String {
        val mensagem = "EmpresaOnibus de ônibus interestadual: " + this.origem + " para " + this.destino +
                ", Data/Hora: " + super.df.format(dataHoraPartida.getTime())

        System.out.println(mensagem)
        return mensagem
    }
}
