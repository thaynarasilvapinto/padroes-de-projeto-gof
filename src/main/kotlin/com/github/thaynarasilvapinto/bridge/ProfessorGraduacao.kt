package com.github.thaynarasilvapinto.bridge

class ProfessorGraduacao(imp: ProfessorImplGraduacao) : Professor(imp = imp){

    override fun op() {
		System.out.println("Graduação")
		imp!!.opImpl()
    }
}