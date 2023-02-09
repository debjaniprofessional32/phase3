package com.sportshoes.website.Repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sportshoes.website.Entity.Product;
import com.sportshoes.website.Entity.User;

public interface UserRepositary extends JpaRepository<User, Integer>{
 Optional<User> findUserByEmail(String email);
  List<User> findAll();
  
  @Query("SELECT u FROM User u WHERE u.firstName LIKE %?1%"
          + " OR u.lastName LIKE %?1%"
          + " OR u.email LIKE %?1%")
  public List<User> search(String keyword);
}
