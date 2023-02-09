package com.sportshoes.website.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportshoes.website.Entity.User;
import com.sportshoes.website.Repositary.UserRepositary;

@Service
public class UserService {
	@Autowired
	UserRepositary userRepository;
	public List<User> listOfSignUpUser(){ return userRepository.findAll();}
	public List<User> listAll(String keyword) {
        if (keyword != null) {
            return userRepository.search(keyword);
        }
        return userRepository.findAll();
    }
}
