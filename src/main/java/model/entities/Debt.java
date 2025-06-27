package model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import model.valueobjects.Category;

public class Debt extends ScheduleItem{
	private Category category;
	private BigDecimal currentPaid;
	
	public Debt() {
	}
	public Debt(Integer id, String name, String description, BigDecimal value, LocalDate dueDate, Integer ownerId,
			Category category, BigDecimal currentPaid) {
		super(id, name, description, value, dueDate, ownerId);
		this.category = category;
		this.currentPaid = currentPaid;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public BigDecimal getCurrentPaid() {
		return currentPaid;
	}
	public void addCurrentPaid(BigDecimal amount) {
		currentPaid = currentPaid.add(amount);
	}
	public void subtractCurrentPaid(BigDecimal amount) {
		currentPaid = currentPaid.subtract(amount);
	}
}
