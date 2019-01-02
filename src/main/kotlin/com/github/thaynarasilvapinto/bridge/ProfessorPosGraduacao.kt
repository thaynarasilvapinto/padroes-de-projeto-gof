package com.github.thaynarasilvapinto.bridge

class ProfessorPosGraduacao(emp: Implementador) : Professor(imp = emp) {

    override fun op() {
        System.out.println("Pós graduação")
        imp!!.opImpl()
    }
}