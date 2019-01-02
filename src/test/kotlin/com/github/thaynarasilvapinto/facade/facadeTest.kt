package com.github.thaynarasilvapinto.facade

import org.junit.Test

class facadeTest {
    @Test
    fun `metodo A`() {
        val facade = Facade()
        facade.metodoA()
    }

    @Test
    fun `metodo B`() {
        val facade = Facade()
        facade.metodoB()
    }

}