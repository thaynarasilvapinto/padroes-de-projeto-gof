package com.github.thaynarasilvapinto.abstractfactory

import java.util.*

class ConcretePassagemOnibusUrbano(
    origem: String,
    destino: String,
    dataHoraPartida: Calendar
) : PassagemOnibusUrbano(origem, destino, dataHoraPartida) {

    override fun exibeDetalhes(): String {
        val mensagem = "EmpresaOnibus de ônibus urbana: " + this.origem + " para " + this.destino +
                ", Data/Hora: " + super.df.format(dataHoraPartida.getTime())

        System.out.println(mensagem)
        return mensagem
    }
}
