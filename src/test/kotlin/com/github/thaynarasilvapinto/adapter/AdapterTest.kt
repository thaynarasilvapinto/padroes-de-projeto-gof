package com.github.thaynarasilvapinto.adapter

import org.junit.Test

class AdapterTest {

    @Test
    fun `adapter EUA to Brasil`(){ val plugEUA = PlugAmericano()

		val tomadaModificada = AdapterEUAtoBrasil()

		val s = tomadaModificada.conecta(plugEUA)

		System.out.println(s)

	}
	@Test
    fun `adapter Brasil to EUA`(){
		val plugBrasil = PlugBrasileiro()

		val tomadaModificada = AdapterBrasilToEUA()

		val s = tomadaModificada.conecta(plugBrasil)

		System.out.println(s)

	}
}