package com.github.thaynarasilvapinto.prototype

import org.junit.Test

class PrototypeTest {
    @Test
    fun `deve compor a canção`(){
        var partitura = Partitura()

        partitura.carregaNotas()
        partitura.nota("Do").desenha()
        partitura.nota("Re").desenha()
		partitura.nota("Mi").desenha()
		partitura.nota("Fa").desenha()
		partitura.nota("Fa").desenha()
		partitura.nota("Fa").desenha()
		partitura.nota("Do").desenha()
		partitura.nota("Re").desenha()
		partitura.nota("Do").desenha()
		partitura.nota("Re").desenha()
		partitura.nota("Re").desenha()
		partitura.nota("Re").desenha()
		partitura.nota("Do").desenha()
		partitura.nota("Sol").desenha()
		partitura.nota("Fa").desenha()
		partitura.nota("Mi").desenha()
		partitura.nota("Do").desenha()
		partitura.nota("Sol").desenha()
		partitura.nota("La").desenha()
		partitura.nota("Si").desenha()
		partitura.nota("Do").desenha()
    }
}