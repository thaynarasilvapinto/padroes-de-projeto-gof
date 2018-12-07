package com.github.thaynarasilvapinto.AbstractFactory

import java.util.*

//Produto congreto
class PassagemOnibusUrbano(var origem: String, var destino: String, var dataHoraPartida: Calendar) :
    Passagem(origem, destino, dataHoraPartida) {

    override fun exibeDetalhes() : String {
        val mensagem = "Passagem de ônibus urbana: " + origem + " para " + destino +
                ", Data/Hora: " + super.df.format(dataHoraPartida.getTime())

        System.out.println(mensagem)
        return mensagem
    }
}