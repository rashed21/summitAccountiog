/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;

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
	
	private String amount;
	
	private String duration;
	
	private String fineRate;
	
	private String createDate;
	
	private String modifyDate;

	
	
	public String getFineRate() {
		return fineRate;
	}

	public void setFineRate(String fineRate) {
		this.fineRate = fineRate;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

}
