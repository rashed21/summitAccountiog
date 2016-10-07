/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  Md. Rashedunnabi <rashedunnabi21@gmail.com>
 * @verison	1.0.1
 * @since	1.0.0
 */
public class InstallmentRoot implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8699266577915012744L;
	
	private int installRootID;
	
	private String rootName;
	
	private Double amount;
	
	private String duration;
	
	private Double fineRate;
	
	private Date createDate;
	
	private Date modifyDate;

	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getFineRate() {
		return fineRate;
	}

	public void setFineRate(Double fineRate) {
		this.fineRate = fineRate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public int getInstallRootID() {
		return installRootID;
	}

	public void setInstallRootID(int installRootID) {
		this.installRootID = installRootID;
	}

	public String getRootName() {
		return rootName;
	}

	public void setRootName(String rootName) {
		this.rootName = rootName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}


}
