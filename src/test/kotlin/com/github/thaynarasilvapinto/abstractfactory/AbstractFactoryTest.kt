package com.github.thaynarasilvapinto.abstractfactory

import org.junit.Before
import org.junit.Test
import java.util.*
import kotlin.test.assertEquals

class AbstractFactoryTest {

    lateinit var viacaoXYZInter: EmpresaOnibus
    lateinit var pUrbano: PassagemOnibusUrbano
    lateinit var pInterestadual: PassagemOnibusInterestadual

    @Before
    fun init() {
        viacaoXYZInter = ConcreteEmpresaOnibus()
        pUrbano =
                viacaoXYZInter.emitePassagemOnibusUrbano(
                    "São Paulo",
                    "Campinas",
                    GregorianCalendar(2016, 2, 10, 11, 0))
        pInterestadual =
                viacaoXYZInter.emitePassagemOnibusInterestadual(
                    "São Paulo",
                    "Rio de Janeiro",
                    GregorianCalendar(2016, 3, 20, 8, 30))
    }


    @Test
    fun `deve retornar uma passagem interestadual e uma urbana`() {

        val pUrbanaEsperada = "EmpresaOnibus de ônibus urbana: São Paulo para Campinas, Data/Hora: 10/03/2016 11:00"
        val pInterestadualEsperada =
            "EmpresaOnibus de ônibus interestadual: São Paulo para Rio de Janeiro, Data/Hora: 20/04/2016 08:30"

        val pUrbanoRecebido = pUrbano.exibeDetalhes()
        val pInterestadualRecebido = pInterestadual.exibeDetalhes()

        assertEquals(pUrbanaEsperada, pUrbanoRecebido)
        assertEquals(pInterestadualEsperada, pInterestadualRecebido)
    }
}