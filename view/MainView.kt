package com.example.view

import com.example.controller.ToDoController
import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*
import javafx.scene.layout.Priority

class MainView : View("To-Do Application") {        //Class for main view layout of application
    val todocontroller: ToDoController by inject()

    override val root = borderpane {
        top = vbox {
            label("To-Do List") {
                alignment = Pos.CENTER
                useMaxWidth = true
            }
        }
        center<CenterView>()

        bottom = hbox {
            var texx: String = ""                       // box to add items to list
            alignment = Pos.CENTER
            useMaxWidth = true
            textfield{
                promptText = "Add To-Do Item"
                hgrow = Priority.ALWAYS
                setOnAction {
                    todocontroller.listitem(text)       //press enter to add
                    clear()
                }
            }
            }
        }
    }


