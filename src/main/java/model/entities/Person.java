package model.entities;

public class Person {
	private Integer id;
	private String name;
	
	public Person() {	
	}
	public Person(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
