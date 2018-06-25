package com.freesoft.graphqlfamilytree.dao

import com.freesoft.graphqlfamilytree.model.Person
import org.springframework.stereotype.Component

@Component
class PersonDao {

    private val data = mutableListOf(Person(id = "jd", name = "John Doe"),
            Person(id = "fk", name = "Freddy Krugger"),
            Person(id = "hs", name = "Han Solo"),
            Person(id = "js", name = "Jack Sparrow"))

    fun getPersonById(id: String) = data.firstOrNull { person -> person.id == id }
}