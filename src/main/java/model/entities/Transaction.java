package model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import model.enums.PaymentMethod;
import model.valueobjects.Category;

public class Transaction {
	private Integer id;
	private String name;
	private String description;
	private BigDecimal value;
	private LocalDate date;
	private Category category;
	private Integer ownerId;
	private Integer bankAccountId;
	private PaymentMethod paymentMethod;
	private LinkReference link;
	
	public Transaction() {
	}
	public Transaction(Integer id, String name, String description, BigDecimal value, LocalDate date, Category category,
			Integer ownerId, Integer bankAccountId, PaymentMethod paymentMethod, LinkReference link) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.value = value;
		this.date = date;
		this.category = category;
		this.ownerId = ownerId;
		this.bankAccountId = bankAccountId;
		this.paymentMethod = paymentMethod;
		this.link = link;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public Integer getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(Integer bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public LinkReference getLink() {
		return link;
	}
	public void setLink(LinkReference link) {
		this.link = link;
	}	
}
