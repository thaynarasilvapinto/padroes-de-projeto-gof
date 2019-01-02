package com.github.thaynarasilvapinto.Adapter

class AdapterEUAtoBrasil : TomadaBrasileira(){
    fun conecta(plug: PlugAmericano): String {
        return plug.obtemEletricidade() + this.nomeRede
    }
}