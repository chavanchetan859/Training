package com.training.spring;

public class Laptop {
private String brand;
private int Price;

public Laptop() {
	super();
}
public Laptop(String brand, int price) {
	super();
	this.brand = brand;
	Price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", Price=" + Price + "]";
}

}
