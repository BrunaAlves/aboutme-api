package com.aboutme.api.repository;

import com.aboutme.api.model.CBTForm;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CBTFormRepository extends MongoRepository<CBTForm, String> {

    void deleteById(String id);
    Optional<CBTForm> findById(String id);
}
