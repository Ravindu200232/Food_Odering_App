package com.customer;

public class Staff {
	
	private int sid;
	private String sname;
	private String sphone;
	private String semail;
	private String saddress;
	
	public Staff(int sid, String sname, String sphone, String semail, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sphone = sphone;
		this.semail = semail;
		this.saddress = saddress;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getSphone() {
		return sphone;
	}

	public String getSemail() {
		return semail;
	}

	public String getSaddress() {
		return saddress;
	}
	
	
	
	

}
