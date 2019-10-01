package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Akansha Shah
 * @Creation_date 1st oct 2019 10:12AM
 * @Modification_date 1st oct 2019 10:12AM
 * @Version
 * @Copyright zensar technologies. All right reserved
 * @Discription
 */
@Entity
public class Product {
	@Id
	@Column(name="product_id")
	private int productId;
	private String name;
	private String brand;
	private float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
