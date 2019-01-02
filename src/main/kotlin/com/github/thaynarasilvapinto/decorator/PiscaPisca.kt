package com.github.thaynarasilvapinto.decorator

class PiscaPisca(arvore: Arvore) : Decoracao(arvore) {

    override fun showEnfeites() {
        super.showEnfeites()
        print("Pisca-pisca, ")
    }
}