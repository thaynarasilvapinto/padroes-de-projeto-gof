package com.github.thaynarasilvapinto.decorator

class Estrela(arvore: Arvore) : Decoracao(arvore) {

    override fun showEnfeites() {
        super.showEnfeites()
        print("Estrela, ")
    }
}