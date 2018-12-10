package com.github.thaynarasilvapinto.builder

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class BuilderTest {
    lateinit var cozinha: Cozinha

    //Builders
    lateinit var b1: SanduicheBuilder
    lateinit var b2: SanduicheBuilder

    @Before
    fun init() {
        cozinha = Cozinha()
        b1 = HamburguerBuilder()
        b2 = FishBuilder()
    }

    @Test
    fun `deve fazer um sanduiche de hamburguer`() {
        val sanduicheEsperado = "Abre pão de hamburguer!" +
                "\n" +
                "Insere carne e queijo!" +
                "\n" +
                "Fecha pao de hamburguer!" +
                "\n"
        val sanduicheAtual = cozinha.fazSanduiche(b1)

        assertEquals(sanduicheEsperado, sanduicheAtual.preparacao)
    }

    @Test
    fun `deve fazer um fishburguer`() {
        val sanduicheEsperado = "Abre pão de fishburguer!" +
                "\n" +
                "Insere filé de peixe!" +
                "\n" +
                "Fecha pao de fishburguer!" +
                "\n"
        val sanduicheAtual = cozinha.fazSanduiche(b2)

        assertEquals(sanduicheEsperado, sanduicheAtual.preparacao)
    }
}