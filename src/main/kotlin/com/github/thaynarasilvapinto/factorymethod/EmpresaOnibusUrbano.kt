package com.github.thaynarasilvapinto.factorymethod

import java.util.Calendar

//Fábrica Congreta
class EmpresaOnibusUrbano : Empresa() {

    override fun emitePassagem(origem: String, destino: String, dataHoraPartida: Calendar): Passagem {
        return PassagemOnibusUrbano(origem, destino, dataHoraPartida)
    }
}
