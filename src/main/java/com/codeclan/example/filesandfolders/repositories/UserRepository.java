package com.codeclan.example.filesandfolders.repositories;

import com.codeclan.example.filesandfolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
