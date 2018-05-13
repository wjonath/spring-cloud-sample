package cn.iqoo.user.utils;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.io.Serializable;

public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleMongoRepository<T, ID> implements BaseRepository<T, ID> {

    protected final MongoOperations mongoTemplate;

    protected final MongoEntityInformation<T, ID> entityInformation;

    private Class<T> clazz;

    public BaseRepositoryImpl(MongoEntityInformation<T, ID> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
        this.mongoTemplate = mongoOperations;
        this.entityInformation = metadata;
        clazz = entityInformation.getJavaType();
    }
}