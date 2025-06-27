package model.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class ScheduleItem {
	private Integer id;
	private String name;
	private String description;
	private BigDecimal value;
	private LocalDate dueDate;
	private Integer ownerId;
	
	public ScheduleItem() {
	}
	public ScheduleItem(Integer id, String name, String description, BigDecimal value, LocalDate dueDate,
			Integer ownerId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.value = value;
		this.dueDate = dueDate;
		this.ownerId = ownerId;
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
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
}
