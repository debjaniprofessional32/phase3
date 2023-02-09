package com.sportshoes.website.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportshoes.website.Entity.Role;

public interface RoleRepositary extends JpaRepository<Role,Integer> {

}
