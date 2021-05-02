package com.sibela.datamappingmapper

class BlogCacheMapper : EntityMapper<BlogCacheEntity, Blog>() {

    override fun mapFromEntity(entity: BlogCacheEntity) = Blog(
        id = entity.id,
        title = entity.title,
        body = entity.body,
        image = entity.image,
        category = entity.category
    )

    override fun mapToEntity(domainModel: Blog) = BlogCacheEntity(
        id = domainModel.id,
        title = domainModel.title,
        body = domainModel.body,
        image = domainModel.image,
        category = domainModel.category
    )
}