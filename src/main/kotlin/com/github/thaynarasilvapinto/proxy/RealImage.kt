package com.github.thaynarasilvapinto.proxy

open class RealImage(var filename: String) : Image() {

    fun loadImageFromDisk() {
        System.out.println("-----------------\n" + "Loading   " + filename)
    }

    override fun displayImage() {
        System.out.println("Displaying " + filename)
    }
}
