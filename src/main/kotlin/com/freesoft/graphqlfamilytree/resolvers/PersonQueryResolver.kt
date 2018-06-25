package com.freesoft.graphqlfamilytree.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.freesoft.graphqlfamilytree.dao.PersonDao
import com.freesoft.graphqlfamilytree.model.Person
import org.springframework.stereotype.Component

@Component
class PersonQueryResolver(private val personDao: PersonDao) : GraphQLQueryResolver {

    fun getPersonById(id: String): Person? = personDao.getPersonById(id)
}