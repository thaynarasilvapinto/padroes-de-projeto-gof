package com.github.thaynarasilvapinto.prototype

abstract class NotaMusical : Cloneable {

    override public fun clone(): Any {
        var clone: Any? = null
        try{
            clone = super.clone()
        }catch (ex: CloneNotSupportedException){
            ex.printStackTrace()
        }
        return (clone as NotaMusical?)!!
    }

    abstract fun desenha()

}