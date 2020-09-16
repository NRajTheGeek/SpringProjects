package edu.nraj.models;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Access(AccessType.FIELD)
public class SubCategorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 60)
	private String subCategoryId;
	
	@Column(nullable = false, length = 256)
	private String name;
	
	// putting Join Column here will create a cyclic dependency issue
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "subCategories")
	private List<Category> catagories = new LinkedList<Category>();

	public int getId() {
		return id;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String categoryId) {
		this.subCategoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Category> getCatagories() {
		return catagories;
	}

	public void setCatagories(List<Category> catagories) {
		this.catagories = catagories;
	}
}
