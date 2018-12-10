package com.github.thaynarasilvapinto.builder

class FishBuilder : SanduicheBuilder() {
    var sanduiche: Sanduiche = Fishburguer()

    override fun abrePao(){
        System.out.println("Abre pão de fishburguer!")
        sanduiche.preparacao = sanduiche.preparacao + "Abre pão de fishburguer!\n"
    }
    override fun insereIngredientes(){
        System.out.println("Insere filé de peixe!")
        sanduiche.preparacao = sanduiche.preparacao + "Insere filé de peixe!\n"
    }
    override fun fechaPao(){
        System.out.println("Fecha pao de fishburguer!")
        sanduiche.preparacao = sanduiche.preparacao + "Fecha pao de fishburguer!\n"
    }
    override fun sanduiche() : Sanduiche{
        System.out.println("O fishburguer esta pronto!")
        return sanduiche
    }
}