package com.mvc.user.vo;

public class UserVO {
	private int uNo;
	private String uName;
	private String uId;
	private String uPw;
	private String uEmail;
	private String uPhoneNo;
	private String uAddress;	
	private String uRegDate;
	
	
	public UserVO(){}
	
	
	public UserVO(int uNo, String uName, String uId, String uPw, String uEmail, String uPhoneNo, String uAddress,
			String uRegDate) {
		super();
		this.uNo = uNo;
		this.uName = uName;
		this.uId = uId;
		this.uPw = uPw;
		this.uEmail = uEmail;
		this.uPhoneNo = uPhoneNo;
		this.uAddress = uAddress;
		this.uRegDate = uRegDate;
	}
	
	public int getuNo() {
		return uNo;
	}
	public void setuNo(int uNo) {
		this.uNo = uNo;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuPw() {
		return uPw;
	}
	public void setuPw(String uPw) {
		this.uPw = uPw;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuPhoneNo() {
		return uPhoneNo;
	}
	public void setuPhoneNo(String uPhoneNo) {
		this.uPhoneNo = uPhoneNo;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public String getuRegDate() {
		return uRegDate;
	}
	public void setuRegDate(String uRegDate) {
		this.uRegDate = uRegDate;
	}
	
	
	

}
