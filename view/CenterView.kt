package com.example.view

import tornadofx.*
import com.example.controller.ToDoController

class CenterView : View("My View") {                    //class for center view of borderpane
    val todocontroller : ToDoController by inject()
    override val root = listview (todocontroller.doitem) {
        isEditable = true
        cellFragment(itemfragment::class)
    }
}
