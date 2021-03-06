package com.teksystems.Capstone3BackEnd.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, unique = true)
	private String productName;
	private int quantity;
	@Column(nullable = false, unique = true)
	private String serialNumber;
	private Double price;
	private String category;
	private String imageUrl;
	private String thumbnail;
	private String description;
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    private int regionNe; 
    private int regionSe; 
    private int regionSw;

	public ProductEntity(Long id, String productName, int quantity, Double price,  String serialNumber, String category, String imageUrl, String thumbnail, String description, int regionNe, int regionSe, int regionSw) {
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.serialNumber = serialNumber;
		this.category = category;
		this.imageUrl = imageUrl;
		this.thumbnail = thumbnail;
		this.description = description;
		this.regionNe = regionNe;
		this.regionSe = regionSe;
		this.regionSw = regionSw;
	}

	public ProductEntity(Long id, String productName, int quantity, String serialNumber, Double price, String category, String imageUrl, String thumbnail, String description, Date createdAt, Date updatedAt) {
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
		this.serialNumber = serialNumber;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
		this.thumbnail = thumbnail;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public ProductEntity(String productName, Double price, String category, String imageUrl,
						 String thumbnail, String description, int regionNe, int regionSe, int regionSw) {
		this.productName = productName;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
		this.thumbnail = thumbnail;
		this.description = description;
		this.regionNe = regionNe; 
		this.regionSe = regionSe;
		this.regionSw = regionSw; 
	}

	public ProductEntity(){}


	

	public ProductEntity(String productName) {
		this.productName = productName;
	}
	

	public ProductEntity(Long id, String productName, String serialNumber) {
		this.id = id;
		this.productName = productName;
		this.serialNumber = serialNumber;
	}

	

	

	public ProductEntity(Long id, String productName, String serialNumber, int regionNe) {
		this.id = id;
		this.productName = productName;
		this.serialNumber = serialNumber;
		this.regionNe = regionNe;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public int getRegionNe() {
		return regionNe;
	}

	public void setRegionNe(int regionNe) {
		this.regionNe = regionNe;
	}

	public int getRegionSe() {
		return regionSe;
	}

	public void setRegionSe(int regionSe) {
		this.regionSe = regionSe;
	}

	public int getRegionSw() {
		return regionSw;
	}

	public void setRegionSw(int regionSw) {
		this.regionSw = regionSw;
	}

	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

}

