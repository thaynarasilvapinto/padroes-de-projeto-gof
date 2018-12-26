package com.github.thaynarasilvapinto.factorymethod

import java.util.*

//Fábrica
abstract class Empresa {

    abstract fun emitePassagem(var1: String, var2: String, var3: Calendar): Passagem
}
