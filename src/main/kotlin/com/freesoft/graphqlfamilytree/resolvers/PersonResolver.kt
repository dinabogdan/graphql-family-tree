package com.freesoft.graphqlfamilytree.resolvers

import com.coxautodev.graphql.tools.GraphQLResolver
import com.freesoft.graphqlfamilytree.dao.RelationshipDao
import com.freesoft.graphqlfamilytree.model.Person
import org.springframework.stereotype.Component

@Component
class PersonResolver(private val relationshipDao: RelationshipDao) : GraphQLResolver<Person> {
    fun relationships(person: Person, type: String?) = when (type) {
        null -> relationshipDao.getRelationshipFromPerson(person.id)
        else -> relationshipDao.getRelationshipOfTypeFromPerson(person.id, type)
    }
}