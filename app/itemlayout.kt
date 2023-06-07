package com.example.app

import javafx.beans.property.ObjectProperty
import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import java.util.*

class itemlayout(text: String) {                        //class to itemize to-do item
    val textProperty = SimpleStringProperty(text)
    var text by textProperty
    val completedProperty = SimpleBooleanProperty()
    var completed by completedProperty
}

class itemLayoutModel(property: ObjectProperty<itemlayout>) : ItemViewModel<itemlayout>(itemProperty = property) { //class for layout of items
    val text = bind(autocommit = true) {
        item?.textProperty }
    val completed = bind(autocommit = true) { item?.completedProperty }
}