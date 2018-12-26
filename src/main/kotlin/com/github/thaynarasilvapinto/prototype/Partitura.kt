package com.github.thaynarasilvapinto.prototype

import java.util.*

class Partitura(
    var notaMap: Hashtable<String, NotaMusical> = Hashtable<String, NotaMusical>()
) {

	fun carregaNotas() {
		//Adiciona todos os tipos de notas à estrutura hashtable
        val notaDo = Do()
		notaMap.put("Do", notaDo)

        val notaRe = Re()
		notaMap.put("Re", notaRe)

        val notaMi = Mi()
		notaMap.put("Mi", notaMi)

        val notaFa = Fa()
		notaMap.put("Fa", notaFa)

        val notaSol = Sol()
		notaMap.put("Sol", notaSol)

        val notaLa = La()
		notaMap.put("La", notaLa)

        val notaSi = Si()
		notaMap.put("Si", notaSi)
	}

	fun nota(nome: String): NotaMusical {
		val nota = notaMap[nome]

		return nota!!.clone() as NotaMusical
	}

}
