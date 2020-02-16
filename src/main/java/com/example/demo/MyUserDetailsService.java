package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String firstname) throws UsernameNotFoundException {

		AlienBean bean = repo.findByFirstname(firstname);

		if (bean == null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		return new UserPrinciple(bean);
	}

}
