package com.github.thaynarasilvapinto.Adapter

class AdapterBrasilToEUA : TomadaAmericana(){
    fun conecta(plug: PlugBrasileiro): String {
        return plug.obtemEletricidade() + this.nomeRede
    }
}