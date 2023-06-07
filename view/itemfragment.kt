package com.example.view

import com.example.app.itemLayoutModel
import com.example.app.itemlayout
import com.example.controller.ToDoController
import javafx.scene.layout.Priority
import javafx.scene.paint.Color
import tornadofx.*

class itemfragment : ListCellFragment<itemlayout>() {           //fragrment class to add todo items to list view
        val todocontroller: ToDoController by inject()
        val doitem = itemLayoutModel(itemProperty)

        override val root = hbox {
            checkbox(property = doitem.completed) {
                action {
                    startEdit()
                    commitEdit(item)
                }
            }
            label(doitem.text) {
                hgrow = Priority.ALWAYS
                useMaxSize = true
            }
            button("X") {
                textFill = Color.RED
                action { todocontroller.removeitem(item) }
            }
        }

    }

