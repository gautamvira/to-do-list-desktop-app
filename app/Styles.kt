package com.example.app

import com.sun.org.apache.bcel.internal.Repository.addClass
import javafx.geometry.Pos
import javafx.scene.text.FontWeight
import tornadofx.*
import tornadofx.Stylesheet.Companion.box

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
    }


    init {
        label and heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }
    }
}