package com.emphr.management.service;

import java.util.List;

import com.emphr.management.model.UserRole;

public interface IRoleService {

    UserRole saveRole(UserRole role);
    
    UserRole getRole(Long id);

    UserRole updateRole(UserRole Role);

    void deleteRole(Long id);

    List<UserRole> getAllRoles();

    UserRole findRoleByName(String name);
}



