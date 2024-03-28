package model;

import java.util.Set;

public class User {
	private String username;
	private long phoneNumber;
	private Set<ContactTrie> blockedContacts;
	private Set<ContactTrie> savedContacts;

}
