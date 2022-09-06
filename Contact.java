package com.dao;

import java.util.ArrayList;

public class Contact {
	private String name;
	private ArrayList<Long> numbers = new  ArrayList<Long>();
	private ArrayList<CallHistory> callHistory = new  ArrayList<CallHistory>();
	
	public Contact(String name,long number) {
		this.name = name;
		this.numbers.add(number);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Long> getNumbers() {
		return numbers;
	}
	public void setNumbers(ArrayList<Long> numbers) {
		this.numbers = numbers;
	}
	public ArrayList<CallHistory> getCallHistory() {
		return callHistory;
	}
	public void setCallHistory(ArrayList<CallHistory> callHistory) {
		this.callHistory = callHistory;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", numbers=" + numbers + "]";
	}
	
}
