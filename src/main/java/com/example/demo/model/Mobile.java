package com.example.demo.model;

public class Mobile {
	int id;
	String brand;
	int modelno;
	String ram;
	String phonememory;
	String processor;
	int price;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getPhonememory() {
		return phonememory;
	}
	public void setPhonememory(String phonememory) {
		this.phonememory = phonememory;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", modelno=" + modelno + ", ram=" + ram + ", phonememory="
				+ phonememory + ", processor=" + processor + ", price=" + price + "]";
	}
	
	
	
}
	   