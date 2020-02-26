package com.codeclan.example.filesandfolders.repositories;

import com.codeclan.example.filesandfolders.models.User;
import com.codeclan.example.filesandfolders.projections.UserFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
