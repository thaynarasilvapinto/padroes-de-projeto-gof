package com.github.thaynarasilvapinto.decorator

class Bola(arvore: Arvore) : Decoracao(arvore) {

    override fun showEnfeites() {
        super.showEnfeites()
        print("Bola, ")
    }

}