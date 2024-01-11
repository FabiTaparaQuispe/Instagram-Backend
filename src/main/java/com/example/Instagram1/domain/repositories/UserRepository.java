package com.example.Instagram1.domain.repositories;

import com.example.Instagram1.domain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity, Long>{

}


