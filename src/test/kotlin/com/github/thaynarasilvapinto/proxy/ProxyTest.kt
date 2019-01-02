package com.github.thaynarasilvapinto.proxy

import org.junit.Test

class ProxyTest {
    @Test
    fun `deve mostrar no sisplay as imganes solicitadas`(){
        val image1 = ProxyImage("HiRes_10MB_Photo1");
        val image2 = ProxyImage("HiRes_10MB_Photo2");

        image1.displayImage()
        image2.displayImage()
        image1.displayImage()
    }
}