package com.github.thaynarasilvapinto.bridge

abstract class Professor(var imp: Implementador? = null){

    protected fun Professor(imp: Implementador){
        this.imp = imp
    }

    abstract fun op()
}