package com.emphr.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emphr.management.model.UserRole;

@Repository
public interface IRoleRepository extends JpaRepository<UserRole , Long>{

    UserRole findByName(String name);

}
