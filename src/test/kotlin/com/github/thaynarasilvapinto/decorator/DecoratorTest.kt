package com.github.thaynarasilvapinto.decorator

import org.junit.Test

class DecoratorTest {
    @Test
    fun `deve montar a arvore de natal`() {

        var arvore: Arvore = ArvoreNatal()

        arvore = Estrela(arvore)
        arvore = Bola(arvore)
        arvore = Bola(arvore)
        arvore = Bola(arvore)
        arvore = Bola(arvore)
        arvore = Bola(arvore)
        arvore = PiscaPisca(arvore)
        arvore.showEnfeites()
    }
}