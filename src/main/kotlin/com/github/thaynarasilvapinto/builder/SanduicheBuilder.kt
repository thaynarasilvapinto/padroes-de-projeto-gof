package com.github.thaynarasilvapinto.builder

abstract class SanduicheBuilder {
    abstract fun abrePao()
    abstract fun insereIngredientes()
    abstract fun fechaPao()
    abstract fun sanduiche() : Sanduiche
}