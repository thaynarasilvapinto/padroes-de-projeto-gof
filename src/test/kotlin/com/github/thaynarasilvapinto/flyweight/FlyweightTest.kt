package com.github.thaynarasilvapinto.flyweight

import org.junit.Test

class FlyweightTest {
    @Test
    fun `deve desenhar linha amarela`(){
        var f = FiguraFactory.getFigura("linha")
		f!!.desenha("amarela")
    }
    @Test
    fun `deve desenhar figura oval vermelha`(){
        var f = FiguraFactory.getFigura("oval não preenchida")
		f!!.desenha("vermelha")
    }
}