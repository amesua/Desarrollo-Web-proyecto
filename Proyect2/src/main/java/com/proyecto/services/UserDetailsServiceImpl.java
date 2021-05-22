package com.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.proyecto.entities.Persons;
import com.proyecto.repository.PersonsRepository;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private PersonsRepository personsRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Persons persons = personsRepository.findByUsername(userName);

		if (persons == null)
			throw new UsernameNotFoundException(userName);
 
		return new UserDetailsImpl(persons);
	}

}
