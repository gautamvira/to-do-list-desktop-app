package com.example.controller
import com.example.app.itemlayout
import tornadofx.*


class ToDoController: Controller() {                    //controller class for view
    val doitem = SortedFilteredList<itemlayout>()

    fun listitem(text: String) = doitem.add(itemlayout(text))

    fun removeitem(item: itemlayout) = doitem.remove(item)

    fun toggleCompleted(completed: Boolean) = with(doitem) {
        filter { it.completed != completed }.forEach { it.completed = completed }
         invalidate()
    }
}
