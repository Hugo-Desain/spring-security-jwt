package com.aplose.digihello.service;

import com.aplose.digihello.model.UserRole;
import com.aplose.digihello.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    public UserRole findByName(String name) {
        return userRoleRepository.findByName(name);
    }

    public UserRole saveRole(UserRole role) {
        return userRoleRepository.save(role);
    }
}
