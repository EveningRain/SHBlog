package com.doaio.entity;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private String password;
	private String email;
	private int is_applied;//是否已激活
	private int is_delete;//是否已删除
	private int is_profile;//个人信息是否已经完善
	
	public User(){}

	public User(int id, String username, String password, String email,
			int is_applied, int is_delete, int is_profile) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.is_applied = is_applied;
		this.is_delete = is_delete;
		this.is_profile = is_profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIs_applied() {
		return is_applied;
	}

	public void setIs_applied(int is_applied) {
		this.is_applied = is_applied;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	public int getIs_profile() {
		return is_profile;
	}

	public void setIs_profile(int is_profile) {
		this.is_profile = is_profile;
	};
	


}
