package com.github.thaynarasilvapinto.builder

class Cozinha {
    fun fazSanduiche(builder: SanduicheBuilder) : Sanduiche {
        builder.abrePao()
        builder.insereIngredientes()
        builder.fechaPao()
        return builder.sanduiche()
    }
}