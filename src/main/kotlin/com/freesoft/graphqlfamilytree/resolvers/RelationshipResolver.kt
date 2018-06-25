package com.freesoft.graphqlfamilytree.resolvers

import com.coxautodev.graphql.tools.GraphQLResolver
import com.freesoft.graphqlfamilytree.dao.PersonDao
import com.freesoft.graphqlfamilytree.model.Relationship
import org.springframework.stereotype.Component

@Component
class RelationshipResolver(private val personDao: PersonDao) : GraphQLResolver<Relationship> {
    fun getFrom(relationship: Relationship) = personDao.getPersonById(relationship.from)
    fun getTo(relationship: Relationship) = personDao.getPersonById(relationship.to)
}