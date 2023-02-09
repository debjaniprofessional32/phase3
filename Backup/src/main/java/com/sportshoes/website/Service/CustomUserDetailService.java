package com.sportshoes.website.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sportshoes.website.Entity.CustomUserDetail;
import com.sportshoes.website.Entity.User;
import com.sportshoes.website.Repositary.UserRepositary;
@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	UserRepositary userRepositary;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepositary.findUserByEmail(email);
		user.orElseThrow(()-> new UsernameNotFoundException("User not Found"));
	    return user.map(CustomUserDetail::new).get();
	
	}

}
