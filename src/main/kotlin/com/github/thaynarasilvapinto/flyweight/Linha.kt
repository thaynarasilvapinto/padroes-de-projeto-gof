package com.github.thaynarasilvapinto.flyweight


class Linha : Figura() {

    override fun desenha(cor: String) {
        println("Figura linha $cor")
    }

}