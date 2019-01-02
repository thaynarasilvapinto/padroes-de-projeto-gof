package com.github.thaynarasilvapinto.adapter

class PlugBrasileiro : Plug() {
    override fun obtemEletricidade(): String {
        return "Plug brasileiro conectado à "
    }
}