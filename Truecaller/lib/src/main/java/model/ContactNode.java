package model;

import java.util.HashMap;
import java.util.Map;

public class ContactNode {
	private int data;
	private Map<Integer,ContactNode> childNodes;
	public ContactDetails contactDetails;
	
	public ContactNode(int d) {
		data = d;
		childNodes = new HashMap<Integer, ContactNode>();
	}

	public int getData() {
		return data;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public void addChildNodes(Integer node, ContactNode val) {
		if(childNodes != null)
			childNodes.put(node, val);
	}
	
	public ContactNode getChildNode(int d) {
		return childNodes.get(d);
	}
	
	public boolean hasChildNode(int d) {
		ContactNode temp = childNodes.get(d);
		return temp!=null;
	}
}
