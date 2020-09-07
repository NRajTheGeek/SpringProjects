package edu.nraj.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SubCategories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String subCategoryId;
	
	private String name;
	
	@ManyToMany
	@JsonIgnore
	@JoinColumn(name="id")
	private List<Categories> catagories;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Categories> getCatagories() {
		return catagories;
	}

	public void setCatagories(List<Categories> catagories) {
		this.catagories = catagories;
	}
}
