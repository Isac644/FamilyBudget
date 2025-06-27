package database;

import java.util.ArrayList;
import java.util.List;

import model.entities.BankAccount;
import model.entities.Debt;
import model.entities.Expense;
import model.entities.Income;
import model.entities.LinkReference;
import model.entities.Person;
import model.entities.Transaction;
import model.valueobjects.Bank;
import model.valueobjects.Category;

public class Database {
	private List<Person> people = new ArrayList<>();
	private List<Transaction> transactions = new ArrayList<>();
	private List<BankAccount> bankAccounts = new ArrayList<>();
	private List<Expense> expenses = new ArrayList<>();
	private List<Income> income = new ArrayList<>();
	private List<Debt> debts = new ArrayList<>();
	private List<LinkReference> linkReferences = new ArrayList<>();
	private List<Bank> bank = new ArrayList<>();
	private List<Category> categories = new ArrayList<>();
	
	public Database() {
	}

	public List<Person> getPeople() {
		return people;
	}
	public void setPeople(List<Person> people) {
		this.people = people;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	public List<Expense> getExpenses() {
		return expenses;
	}
	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
	public List<Income> getIncome() {
		return income;
	}
	public void setIncome(List<Income> income) {
		this.income = income;
	}
	public List<Debt> getDebts() {
		return debts;
	}
	public void setDebts(List<Debt> debts) {
		this.debts = debts;
	}
	public List<LinkReference> getLinkReferences() {
		return linkReferences;
	}
	public void setLinkReferences(List<LinkReference> linkReferences) {
		this.linkReferences = linkReferences;
	}
	public List<Bank> getBank() {
		return bank;
	}
	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
} 