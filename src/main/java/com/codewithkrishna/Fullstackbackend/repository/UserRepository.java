package com.codewithkrishna.Fullstackbackend.repository;

import com.codewithkrishna.Fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
