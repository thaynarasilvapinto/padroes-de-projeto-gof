package com.github.thaynarasilvapinto.FactoryMethod

import org.junit.Before
import org.junit.Test
import java.util.*
import kotlin.test.assertEquals

class FactoryMethodTest {

    lateinit var viacaoABCLocal: Empresa
    lateinit var viacaoXYZInter: Empresa
    lateinit var pUrbano: Passagem
    lateinit var pInterestadual: Passagem

    @Before
    fun init(){
        viacaoABCLocal = EmpresaOnibusUrbano()
        viacaoXYZInter = EmpresaOnibusInterestadual()
        pUrbano =
                viacaoABCLocal.emitePassagem("São Paulo", "Campinas", GregorianCalendar(2016, 2, 10, 11, 0))
        pInterestadual =
                viacaoXYZInter.emitePassagem("São Paulo", "Rio de Janeiro", GregorianCalendar(2016, 3, 20, 8, 30))
    }


    @Test
    fun `deve retornar uma passagem interestadual e uma urbana`(){

        val pUrbanaEsperada = "Passagem de ônibus urbana: São Paulo para Campinas, Data/Hora: 10/03/2016 11:00"
        val pInterestadualEsperada = "Passagem de ônibus interestadual: São Paulo para Rio de Janeiro, Data/Hora: 20/04/2016 08:30"

        val pUrbanoRecebido = pUrbano.exibeDetalhes()
        val pInterestadualRecebido = pInterestadual.exibeDetalhes()

        assertEquals(pUrbanaEsperada, pUrbanoRecebido)
        assertEquals(pInterestadualEsperada, pInterestadualRecebido)
    }

}