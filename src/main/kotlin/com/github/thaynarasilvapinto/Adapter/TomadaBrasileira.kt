package com.github.thaynarasilvapinto.Adapter


open class TomadaBrasileira : Tomada<PlugBrasileiro>() {

    override val nomeRede = "tomada brasileira"

    override fun conecta(plug: PlugBrasileiro): String {
        return plug.obtemEletricidade() + this.nomeRede
    }
}