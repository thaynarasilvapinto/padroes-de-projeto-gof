package com.github.thaynarasilvapinto.flyweight

import java.util.*


object FiguraFactory {

    private val figuras = HashMap<String, Figura?>()

    fun getFigura(nome: String): Figura? {
        var fig: Figura? = figuras[nome]

        if (fig == null) {
            if (nome == "oval preenchida") {
                fig = Oval(true)
            } else if (nome == "oval não preenchida") {
                fig = Oval(false)
            } else if (nome == "linha") {
                fig = Linha()
            }

            figuras[nome] = fig
        }
        return fig
    }
}