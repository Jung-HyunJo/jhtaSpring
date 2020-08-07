package kr.co.jhta.vo;

import java.util.Date;

public class User {

	private String userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private Date userCreatedDate;
	
	public User() {}
	
	
	public User(String userId, String userName, String userPassword, String userEmail, Date userCreatedDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userCreatedDate = userCreatedDate;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public Date getUserCreatedDate() {
		return userCreatedDate;
	}


	public void setUserCreatedDate(Date userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}
	
}
