package com.github.thaynarasilvapinto.composite

//Component
abstract class Empregado(
    protected var nome: String,
    protected var salario: Double
){
    //Exibe detalhes do empregado
    abstract fun print()
    abstract fun add(empregado: Empregado)
    abstract fun remove(empregado: Empregado)
}