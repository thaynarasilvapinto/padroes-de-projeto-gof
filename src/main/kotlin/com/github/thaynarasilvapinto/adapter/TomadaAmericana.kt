package com.github.thaynarasilvapinto.adapter

open class TomadaAmericana : Tomada<PlugAmericano>() {

    override val nomeRede = "tomada americana"

    override fun conecta(plug: PlugAmericano): String {
        return plug.obtemEletricidade() + this.nomeRede
    }
}