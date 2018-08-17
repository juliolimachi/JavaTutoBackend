package com.tutorial.demos.services;

import java.util.List;

import com.tutorial.demos.model.User;

public interface UserService {

	//Ingresa Usuarios
	 User save(User user);
    //Lista de Usuarios
	 List<User> findAll();
	 
	 
	 //Eliminar usuario por id
    	void deleteUser(Long id);

	
}
