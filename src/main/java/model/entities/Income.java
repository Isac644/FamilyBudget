package model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import model.enums.Frequency;

public class Income extends ScheduleItem{
	private Boolean isVariable;
	private Integer bankAccountId;
	private Frequency frequency;
	
	public Income() {
	}
	public Income(Integer id, String name, String description, BigDecimal value, LocalDate dueDate, Integer ownerId,
			Boolean isVariable, Integer bankAccountId, Frequency frequency) {
		super(id, name, description, value, dueDate, ownerId);
		this.isVariable = isVariable;
		this.bankAccountId = bankAccountId;
		this.frequency = frequency;
	}
	
	public Boolean getIsVariable() {
		return isVariable;
	}
	public void setIsVariable(Boolean isVariable) {
		this.isVariable = isVariable;
	}
	public Integer getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(Integer bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public Frequency getFrequency() {
		return frequency;
	}
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
}
