package com.bmbs.sale.bean;

import java.util.List;

public class ProductPO {
	
	private String productID;
	private String productName;
	private String mainPicUrl;
	private String introduction;
	private Double price;
	private String material;
	private String producer;
	private String stuff;
	private String description;
	private ProductTypePO productType;
	private List<ProductPicPO> productPics;
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getMainPicUrl() {
		return mainPicUrl;
	}
	public void setMainPicUrl(String mainPicUrl) {
		this.mainPicUrl = mainPicUrl;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getStuff() {
		return stuff;
	}
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductTypePO getProductType() {
		return productType;
	}
	public void setProductType(ProductTypePO productType) {
		this.productType = productType;
	}
	public List<ProductPicPO> getProductPics() {
		return productPics;
	}
	public void setProductPics(List<ProductPicPO> productPics) {
		this.productPics = productPics;
	}
}
