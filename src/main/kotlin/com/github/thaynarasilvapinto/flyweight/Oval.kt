package com.github.thaynarasilvapinto.flyweight

class Oval(var preenchido: Boolean = false) : Figura() {

    override fun desenha(cor: String) {
        if (preenchido) {
            System.out.println("Figura oval preenchida " + cor)
        } else {
            System.out.println("Figura oval não preenchida " + cor)
        }
    }
}