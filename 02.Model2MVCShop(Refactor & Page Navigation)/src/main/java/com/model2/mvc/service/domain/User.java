package com.model2.mvc.service.domain;

import java.sql.Date;


public class User {
	
	///Field
	private String userId;		// ID
	private String userName;	// 이름
	private String password;	// 비밀번호
	private String role;
	private String ssn;			// 식별번호
	private String phone;		// 폰
	private String addr;		// 주소
	private String email;		// 이메일
	private Date regDate;		// 등록일자
	
	///Constructor
	public User(){
	}
	
	///Method 
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
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "UserVO : [userId] "+userId+" [userName] "+userName+" [password] "+password+" [role] "+ role
			+" [ssn] "+ssn+" [phone] "+phone+" [email] "+email+" [regDate] "+regDate;
	}
}