package com.xywei.springsecurity;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

	/**
	 * userdetails 是一个接口，user为其实现类
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = new User("a", "1", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_A,ROLE_USER"));

		return user;
	}

}
