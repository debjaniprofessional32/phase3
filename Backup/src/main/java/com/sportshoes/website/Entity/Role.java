package com.sportshoes.website.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="roles")
public class Role {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
	@NotEmpty
	@Column(nullable=false,unique=true)
private String name;
	@ManyToMany(mappedBy="roles")
private List<User> user;
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public Role(Integer id, String name, List<User> user) {
	super();
	this.id = id;
	this.name = name;
	this.user = user;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<User> getUser() {
	return user;
}
public void setUser(List<User> user) {
	this.user = user;
}
@Override
public String toString() {
	return "Role [id=" + id + ", name=" + name + ", user=" + user + "]";
}

}
