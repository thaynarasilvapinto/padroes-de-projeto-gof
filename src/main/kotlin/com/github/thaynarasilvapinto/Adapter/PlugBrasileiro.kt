package com.github.thaynarasilvapinto.Adapter

class PlugBrasileiro : Plug() {
    override fun obtemEletricidade(): String {
        return "Plug brasileiro conectado à "
    }
}