package com.flp.ems.model.user;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1994989825433206182L;
	
	private String username;
	private String password;
	private String newPassword;
	private String role;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", role=" + role + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	

}
