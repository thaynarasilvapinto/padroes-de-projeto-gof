package com.github.thaynarasilvapinto.facade

class Facade(
    var sis1: SubSistemaUm = SubSistemaUm(),
    var sis2: SubSistemaDois = SubSistemaDois(),
    var sis3: SubSistemaTres = SubSistemaTres()
) {
    fun metodoA() {
        sis1.metodoUm() //subsistema 1
        sis2.metodoDois() //subsistema 2
        sis3.metodoTres() //subsistema 3
    }

    fun metodoB() {
        sis3.metodoTres() //subsistema 3
        sis2.metodoDois() //subsistema 2
        sis1.metodoUm() //subsistema 1
    }
}