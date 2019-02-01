package com.servlet.pojo;

import java.io.Serializable;

public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public UserInfo() {
		super();
	}

	private int id;
	private String email;
	private String password;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return email;
	}

	public void setUsername(String username) {
		this.email = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", email=" + email + ", password=" + password + ", address=" + address + "]";
	}

	

}
