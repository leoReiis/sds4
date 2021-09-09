package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {
private static final long serialVersionUID = 1L;
	
	private Long id;
	private String Name;
		
	public SellerDTO () {
	}

	public SellerDTO(Long id, String name) {
		this.id = id;
		Name = name;
		
	}
		
	public SellerDTO(Seller entity) {
			this.id = entity.getId();
			this.Name = entity.getName();
		}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
