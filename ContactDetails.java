package com.dao;

import java.util.ArrayList;

public class ContactDetails {
	private ArrayList<Contact> contactList; 
	private static ContactDetails obj= null;
	private ContactDetails() {
		this.contactList = new ArrayList<Contact>();
	}
	
	public static ContactDetails object() {
		if(obj==null) {
			obj = new ContactDetails();
		}
		return obj;
	}
	
	public void addContact(String name,long number) {
		this.contactList.add(new Contact(name,number));
	}
	
	public ArrayList<Contact> showContact() {
		return this.contactList;
	}
	
}

