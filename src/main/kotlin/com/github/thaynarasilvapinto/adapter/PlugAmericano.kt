package com.github.thaynarasilvapinto.adapter

class PlugAmericano : Plug() {
    override fun obtemEletricidade(): String {
        return "Plug americando conectado à "
    }
}