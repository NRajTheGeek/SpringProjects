package edu.nraj.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Access(AccessType.FIELD)
public class Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(nullable = false, length = 60)
	private String typeId;
	
	@Column(nullable = false, length = 256)
	private String name;
	
	public Type() {
		// TODO Auto-generated constructor stub
	}
	
	public Type(String typeId, String name) {
		this.typeId = typeId;
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
