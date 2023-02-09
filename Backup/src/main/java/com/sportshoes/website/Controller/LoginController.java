package com.sportshoes.website.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sportshoes.website.Entity.Role;
import com.sportshoes.website.Entity.User;
import com.sportshoes.website.Repositary.RoleRepositary;
import com.sportshoes.website.Repositary.UserRepositary;
import com.sportshoes.website.global.GlobalData;

@Controller
public class LoginController {
@Autowired
private BCryptPasswordEncoder bCryptPasswordEncoder;

@Autowired
UserRepositary userRepositary;
@Autowired
RoleRepositary roleRepositary;


@GetMapping("/login")
public String login() {
	        GlobalData.cart.clear();                                      // for clearing cart
	return "login";
}
@GetMapping("/register")
public String registerGet() {
	
	return "register";	
}

@PostMapping("/register")
public String registerGetrPost(@ModelAttribute("user")User user,HttpServletRequest request )throws ServletException {
	String password=user.getPassword();
	
	user.setPassword(bCryptPasswordEncoder.encode(password));
	 List<Role> roles=new ArrayList<>();
	 roles.add(roleRepositary.findById(2).get());
	 user.setRoles(roles);
	 userRepositary.save(user);
	 request.login(user.getEmail(),password);
	 return"redirect:/";
}




}

