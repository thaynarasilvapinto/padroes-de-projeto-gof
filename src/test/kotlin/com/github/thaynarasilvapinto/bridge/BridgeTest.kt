package com.github.thaynarasilvapinto.bridge

import org.junit.Test

class BridgeTest {
    @Test
    fun `deve ver o professor de Graduacao`(){
        val grad = ProfessorGraduacao(ProfessorImplGraduacao())
        grad.op()
    }
    @Test
    fun `deve ver o professor de Pos Graduacao`(){
        val grad = ProfessorPosGraduacao(ProfessorImplPosGraduacao())
        grad.op()
    }
}