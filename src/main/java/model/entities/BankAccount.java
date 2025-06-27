package model.entities;

import model.valueobjects.Bank;

public class BankAccount {
	private Integer id;
	private Integer ownerId;
	private Bank bank;
	
	public BankAccount() {
	}
	public BankAccount(Integer id, Integer ownerId, Bank bank) {
		super();
		this.id = id;
		this.ownerId = ownerId;
		this.bank = bank;
	}
	
	public Integer getId() {
		return id;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}
