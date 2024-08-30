package com.customer;

public class Admin {
	
	private int aid;
	private String aname;
	private String aemail;
	private String aphone;
	private String ausername;
	private String apassword;
	
	public Admin(int aid, String aname, String aemail, String aphone, String ausername, String apassword) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.aemail = aemail;
		this.aphone = aphone;
		this.ausername = ausername;
		this.apassword = apassword;
	}

	public int getAid() {
		return aid;
	}

	public String getAname() {
		return aname;
	}

	public String getAemail() {
		return aemail;
	}

	public String getAphone() {
		return aphone;
	}

	public String getAusername() {
		return ausername;
	}

	public String getApassword() {
		return apassword;
	}
	
	
	
	

}
