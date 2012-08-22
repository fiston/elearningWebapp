package com.elearning.webapp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Material {
	private int materialId;
	private String material;

	@Id
	@GeneratedValue
	@Column(name = "material_id")
	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	@Column(name = "material_location")
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
