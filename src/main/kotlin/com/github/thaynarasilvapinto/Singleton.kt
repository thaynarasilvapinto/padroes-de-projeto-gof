package com.github.thaynarasilvapinto

class Singleton private constructor(var mensagem: String? = null) {

    constructor():this(null)

    fun criar(janela: String): String {
        if (this.mensagem == null){
            this.mensagem = Singleton(janela).mensagem!!
            return this.mensagem!!
        }
        else
            return this.mensagem!!
    }

}