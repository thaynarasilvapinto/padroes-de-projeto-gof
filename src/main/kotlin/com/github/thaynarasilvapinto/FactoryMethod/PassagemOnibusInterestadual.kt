package com.github.thaynarasilvapinto.FactoryMethod

import java.util.*

//Produto congreto
class PassagemOnibusInterestadual(var origem: String, var destino: String, var dataHoraPartida: Calendar) :
    Passagem(origem, destino, dataHoraPartida) {

    override fun exibeDetalhes() : String {
        val mensagem = "Passagem de ônibus interestadual: " + origem + " para " + destino +
                ", Data/Hora: " + super.df.format(dataHoraPartida.getTime())

        System.out.println(mensagem)
        return mensagem
    }
}