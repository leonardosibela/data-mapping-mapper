package com.sibela.datamappingbuilder

abstract class EntityMapper<Entity, DomainModel> {

    abstract fun mapFromEntity(entity: Entity): DomainModel

    abstract fun mapToEntity(domainModel: DomainModel): Entity

    fun mapListFromEntityList(entities: List<Entity>): List<DomainModel> {
        return entities.map { mapFromEntity(it) }
    }

    fun mapToEntityList(domainModels: List<DomainModel>): List<Entity> {
        return domainModels.map { mapToEntity(it) }
    }
}