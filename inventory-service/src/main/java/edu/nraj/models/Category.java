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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Access(AccessType.FIELD)
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 60)
	private String categoryId;
	
	@Column(nullable = false, length = 256)
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="CATAGORIES_SUBCATAGORIES", joinColumns = @JoinColumn(name="CATEGORY_ID")
			, inverseJoinColumns = @JoinColumn(name="SUBCATEGORY_ID"))
	private List<SubCategorie> subCategories = new LinkedList<SubCategorie>();

	public int getId() {
		return id;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SubCategorie> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategorie> subCategories) {
		this.subCategories = subCategories;
	}
	
	
}
