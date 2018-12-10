package com.github.thaynarasilvapinto.Singleton

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class SingletonTest {
    lateinit var  singleton: Janela

    @Before
    fun init(){
        singleton = Janela()
    }

    @Test
    fun `deve criar uma janela`(){
        val mensagem: String = "primeira chamda"
        val resultado = singleton.criar(mensagem)

        assertEquals(mensagem,resultado)
    }

    @Test
    fun `deve criar apenas uma janela com duas chamadas de janela`(){
        val primeiraMensagem: String = "Primeira Chamada"
        val segundaMensagem: String = "Segunda Chamada"

        val primeriaChamada = singleton.criar(primeiraMensagem)
        val segundaChamada = singleton.criar(segundaMensagem)

        assertEquals(primeiraMensagem, primeriaChamada)
        assertEquals(primeiraMensagem, segundaChamada)
    }

    @Test
    fun `ao criar uma Janela com o contrutor ele nao deve permitir que o parametro Janela seja modificado`(){
        val janelaContrutor = Janela()

        assertNull(janelaContrutor.mensagem)
    }
}