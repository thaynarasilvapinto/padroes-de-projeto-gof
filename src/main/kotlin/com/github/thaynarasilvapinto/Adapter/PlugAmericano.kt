package com.github.thaynarasilvapinto.Adapter

class PlugAmericano : Plug() {
    override fun obtemEletricidade(): String {
        return "Plug americando conectado à "
    }
}