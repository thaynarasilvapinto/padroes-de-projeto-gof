package com.github.thaynarasilvapinto.FactoryMethod

import java.util.*

//Fábrica Congreta
class EmpresaOnibusInterestadual : Empresa() {

    override fun emitePassagem(origem: String, destino: String, dataHoraPartida: Calendar): Passagem {
        return PassagemOnibusInterestadual(origem, destino, dataHoraPartida)
    }
}
