package com.github.thaynarasilvapinto.Adapter

abstract class Tomada<P> {

    abstract val nomeRede: String

    abstract fun conecta(plug: P): String
}