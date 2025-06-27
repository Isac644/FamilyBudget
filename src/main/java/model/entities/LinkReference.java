package model.entities;

import model.enums.EntryType;

public class LinkReference {
	private Integer id;
	private EntryType type;
	private Integer linkId;
	
	public LinkReference() {
	}
	public LinkReference(Integer id, EntryType type, Integer linkId) {
		super();
		this.id = id;
		this.type = type;
		this.linkId = linkId;
	}
	public Integer getId() {
		return id;
	}
	public EntryType getType() {
		return type;
	}
	public void setType(EntryType type) {
		this.type = type;
	}
	public Integer getLinkId() {
		return linkId;
	}
	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}
}
