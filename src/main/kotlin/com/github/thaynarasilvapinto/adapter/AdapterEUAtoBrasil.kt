package com.github.thaynarasilvapinto.adapter

class AdapterEUAtoBrasil : TomadaBrasileira(){
    fun conecta(plug: PlugAmericano): String {
        return plug.obtemEletricidade() + this.nomeRede
    }
}