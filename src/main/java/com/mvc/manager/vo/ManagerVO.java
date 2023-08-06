package com.mvc.manager.vo;

public class ManagerVO {
	
	private int mgNo;
	private String mgName;
	private String mgId;
	private String mgPw;
	private String mgEmail;
	private String mgPhoneNo;
	
	private String mgRegDate;
	
	public ManagerVO() {}
	

	public ManagerVO(int mgNo, String mgName, String mgId, String mgPw, String mgEmail, String mgPhoneNo,
			String mgRegDate) {
		super();
		this.mgNo = mgNo;
		this.mgName = mgName;
		this.mgId = mgId;
		this.mgPw = mgPw;
		this.mgEmail = mgEmail;
		this.mgPhoneNo = mgPhoneNo;
		this.mgRegDate = mgRegDate;
	}

	public int getMgNo() {
		return mgNo;
	}

	public void setMgNo(int mgNo) {
		this.mgNo = mgNo;
	}

	public String getMgName() {
		return mgName;
	}

	public void setMgName(String mgName) {
		this.mgName = mgName;
	}

	public String getMgId() {
		return mgId;
	}

	public void setMgId(String mgId) {
		this.mgId = mgId;
	}

	public String getMgPw() {
		return mgPw;
	}

	public void setMgPw(String mgPw) {
		this.mgPw = mgPw;
	}

	public String getMgEmail() {
		return mgEmail;
	}

	public void setMgEmail(String mgEmail) {
		this.mgEmail = mgEmail;
	}

	public String getMgPhoneNo() {
		return mgPhoneNo;
	}

	public void setMgPhoneNo(String mgPhoneNo) {
		this.mgPhoneNo = mgPhoneNo;
	}

	public String getMgRegDate() {
		return mgRegDate;
	}

	public void setMgRegDate(String mgRegDate) {
		this.mgRegDate = mgRegDate;
	}
	
	

}
