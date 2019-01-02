package com.github.thaynarasilvapinto.composite

//Composite
class Gerente(nome: String, salario: Double): Empregado(nome, salario) {


    var listaSubordinados: MutableList<Empregado>  = mutableListOf<Empregado>()

    //Exibe a estrutura
    override fun print(){
        System.out.println(super.nome + ", $" + super.salario)
        for(empregado in listaSubordinados){
            empregado.print()
        }
    }
    override fun add(empregado: Empregado) {
        System.out.println(" ")
        listaSubordinados.add(empregado)
    }

    override fun remove(empregado: Empregado) {
        listaSubordinados.remove(empregado)
    }
}
