package com.freesoft.graphqlfamilytree.dao

import com.freesoft.graphqlfamilytree.model.Relationship
import org.springframework.stereotype.Component

@Component
class RelationshipDao {

    private val data = mutableListOf(
            Relationship(from = "js", to = "fk", relationship = "FRIENDS"),
            Relationship(from = "js", to = "jd", relationship = "BROTHERS"),
            Relationship(from = "js", to = "hs", relationship = "BEST_FRIENDS"),
            Relationship(from = "fk", to = "jd", relationship = "BEST_FRIENDS"),
            Relationship(from = "hs", to = "jd", relationship = "BROTHERS"),
            Relationship(from = "hs", to = "fk", relationship = "BEST_FRIENDS")
    )

    fun getRelationshipFromPerson(personId: String) = data.filter { relationship -> relationship.from == personId }

    fun getRelationshipOfTypeFromPerson(personId: String, type: String) = data
            .filter { relationship -> relationship.from == personId }
            .filter { relationship -> relationship.relationship == type }
}