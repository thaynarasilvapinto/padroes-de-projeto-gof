package com.github.thaynarasilvapinto.adapter

class AdapterBrasilToEUA : TomadaAmericana(){
    fun conecta(plug: PlugBrasileiro): String {
        return plug.obtemEletricidade() + this.nomeRede
    }
}