package net.engineeringdigest.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import net.engineeringdigest.journalApp.entity.ConfigJournalAppEntity;
import net.engineeringdigest.journalApp.entity.User;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId>{

}
