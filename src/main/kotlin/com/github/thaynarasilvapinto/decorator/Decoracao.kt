package com.github.thaynarasilvapinto.decorator

abstract class Decoracao(private val arvore: Arvore) : Arvore() {

    override fun showEnfeites() {
        arvore.showEnfeites()
    }
}