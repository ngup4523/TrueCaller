package model;

public class ContactDetails {
	private String contactName;
	private String business;
	private boolean isSpam;
	private boolean isBlocked;
	
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public boolean isSpam() {
		return isSpam;
	}
	public void setSpam(boolean isSpam) {
		this.isSpam = isSpam;
	}
	public boolean isBlocked() {
		return isBlocked;
	}
	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	
	public ContactDetails(String contactName, String business, boolean isSpam, boolean isBlocked) {
		super();
		this.contactName = contactName;
		this.business = business;
		this.isSpam = isSpam;
		this.isBlocked = isBlocked;
	}
	
	public ContactDetails() {
		super();
	}
}
