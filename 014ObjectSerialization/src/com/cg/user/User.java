package com.cg.user;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 7132608054880972871L;
	private int userId;
	private String username;
	private transient String password;
	private String role;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String username, String password, String role) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username
				+ ", password=" + password + ", role=" + role + "]";
	}	
}
