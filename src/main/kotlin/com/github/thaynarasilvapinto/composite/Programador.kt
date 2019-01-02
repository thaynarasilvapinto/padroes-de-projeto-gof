package com.github.thaynarasilvapinto.composite

class Programador(nome: String, salario: Double) : Empregado(nome, salario) {

    //Exibe a estrutura
    override fun print() {
        System.out.println(super.nome + ", $" + super.salario)
    }

    override fun add(empregado: Empregado) {
        System.out.println("Não é possível adicionar empregado subordinado do programador")
    }

    override fun remove(empregado: Empregado) {
        System.out.println("Não é possível remover empregado subordinado do programador")
    }
}