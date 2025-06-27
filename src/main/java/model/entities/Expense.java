package model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import model.enums.ExpenseStatus;
import model.enums.Frequency;
import model.valueobjects.Category;

public class Expense extends ScheduleItem{
	private Category category;
	private ExpenseStatus status;
	private Frequency frequency;
	private Boolean isVariable;
	
	public Expense() {
	}
	public Expense(Integer id, String name, String description, BigDecimal value, LocalDate dueDate, Integer ownerId,
			Category category, ExpenseStatus status, Frequency frequency, Boolean isVariable) {
		super(id, name, description, value, dueDate, ownerId);
		this.category = category;
		this.status = status;
		this.frequency = frequency;
		this.isVariable = isVariable;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public ExpenseStatus getStatus() {
		return status;
	}
	public void setStatus(ExpenseStatus status) {
		this.status = status;
	}
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	public Boolean getIsVariable() {
		return isVariable;
	}
	public void setIsVariable(Boolean isVariable) {
		this.isVariable = isVariable;
	}
	
}
