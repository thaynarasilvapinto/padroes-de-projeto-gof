package com.github.thaynarasilvapinto.builder

class HamburguerBuilder : SanduicheBuilder() {
    var sanduiche: Sanduiche = Hamburguer()

    override fun abrePao(){
        System.out.println("Abre pão de hamburguer!")
        sanduiche.preparacao = sanduiche.preparacao + "Abre pão de hamburguer!\n"
    }
    override fun insereIngredientes(){
        System.out.println("Insere carne e queijo!")
        sanduiche.preparacao = sanduiche.preparacao + "Insere carne e queijo!\n"
    }
    override fun fechaPao(){
        System.out.println("Fecha pao de hamburguer!")
        sanduiche.preparacao = sanduiche.preparacao + "Fecha pao de hamburguer!\n"
    }
    override fun sanduiche() : Sanduiche{
        System.out.println("O sanduiche esta pronto!")
        return sanduiche
    }
}