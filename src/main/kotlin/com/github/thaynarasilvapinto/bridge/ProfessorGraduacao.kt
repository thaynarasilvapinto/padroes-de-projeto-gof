package com.github.thaynarasilvapinto.bridge

class ProfessorGraduacao(imp: ProfessorImplGraduacao) : Professor(imp = imp){

    fun constructor (imp: Implementador){
        this.imp = imp
    }

    override fun op() {
		System.out.println("Graduação")
		imp!!.opImpl()
    }
}