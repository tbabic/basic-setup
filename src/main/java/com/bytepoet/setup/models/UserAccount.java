package com.bytepoet.setup.models;

import org.apache.commons.codec.binary.StringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.bytepoet.setup.exceptions.AuthenticationException;

public class UserAccount {

	private String email;
	private String password;
	
	
	
	public UserAccount(String email, String rawPassword) {
		this.email = email;
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		this.password = encoder.encode(rawPassword);
	}



	public void authenticate(String email, String rawPassword) {
		if (!StringUtils.equals(email, this.email)) {
			throw new AuthenticationException("emails not matching");
		}
		authenticatePassword(rawPassword);
	}
	
	public void authenticatePassword(String rawPassword) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(rawPassword);
		if (StringUtils.equals(this.password, encodedPassword)) {
			throw new AuthenticationException("passwords not matching");
		}
	}
}
