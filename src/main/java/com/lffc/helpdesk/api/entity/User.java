package com.lffc.helpdesk.api.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.lffc.helpdesk.api.enums.ProfileEnum;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Document
public class User {
	
	@Id
	private String id;
	
	@Indexed(unique = true)
	@NotEmpty(message = "Email required")
	@jakarta.validation.constraints.Email
	private String email;
	
	@NotEmpty(message = "Password required")
	@Size(min = 6)
	private String password;
	
	private ProfileEnum profile;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}

	

}
