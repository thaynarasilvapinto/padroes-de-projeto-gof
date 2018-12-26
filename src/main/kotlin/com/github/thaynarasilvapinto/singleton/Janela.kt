package com.github.thaynarasilvapinto.singleton

class Janela private constructor(var mensagem: String? = null) {

    constructor():this(null)

    fun criar(janela: String): String {
        if (this.mensagem == null){
            this.mensagem = Janela(janela).mensagem!!
            return this.mensagem!!
        }
        else
            return this.mensagem!!
    }

}