package com.github.thaynarasilvapinto.proxy

class ProxyImage(private val filename: String) : Image() {

    private var image: RealImage? = null

    override fun displayImage() {
        if (image == null) image = RealImage(filename)
        image!!.loadImageFromDisk()
        image!!.displayImage()
    }
}