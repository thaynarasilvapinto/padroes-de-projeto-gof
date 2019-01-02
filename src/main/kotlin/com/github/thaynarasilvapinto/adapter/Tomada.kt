package com.github.thaynarasilvapinto.adapter

abstract class Tomada<P> {

    abstract val nomeRede: String

    abstract fun conecta(plug: P): String
}