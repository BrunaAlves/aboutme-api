package com.aboutme.api.repository;

import com.aboutme.api.model.Role;
import com.aboutme.api.model.ERole;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {

    Optional<Role> findByName(ERole name);
}
