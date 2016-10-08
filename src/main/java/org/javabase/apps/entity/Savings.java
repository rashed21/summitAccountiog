package org.javabase.apps.entity;

import java.io.Serializable;
import java.util.Date;

public class Savings implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2297149790249178972L;

	private int savingsId;
	private int memberIb;
	private double amount;
	private String month;
	private double fineAmount;
	private Date date;
	private String contact;
	
	public int getSavingsId() {
		return savingsId;
	}
	public void setSavingsId(int savingsId) {
		this.savingsId = savingsId;
	}
	public int getMemberIb() {
		return memberIb;
	}
	public void setMemberIb(int memberIb) {
		this.memberIb = memberIb;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public double getFineAmount() {
		return fineAmount;
	}
	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date data) {
		this.date = date;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
