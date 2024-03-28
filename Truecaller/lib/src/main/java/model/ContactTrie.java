package model;

public class ContactTrie {
	
	private ContactNode root;
	
	public ContactTrie() {
		root = new ContactNode(-1);
	}
	
	public void insertNumber(long number, ContactDetails contactDetails) {
		ContactNode temp = root;
		while(number!= 0) {
			int ch = (int)number%10;
			number = number/10;
			if(temp.hasChildNode(ch)) 
				temp = temp.getChildNode(ch);
			else {
				ContactNode newNode = new ContactNode(ch);
				temp.addChildNodes(ch, newNode);
				temp = newNode;
			}
		}
		temp.setContactDetails(contactDetails);
	}
	
	public ContactDetails getContactDetails(long number) {
		ContactNode temp = root;
		while(number!= 0) {
			int ch = (int)number%10;
			number = number/10;
			if(temp.hasChildNode(ch)) 
				temp = temp.getChildNode(ch);
			else
				return null;
		}
		return temp.getContactDetails();
	}

}
