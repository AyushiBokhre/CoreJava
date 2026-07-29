package com.rays.sort.comparable;

public class Product implements Comparable<Product> {
	public int id;
	public String name;
	public int price;
	public String category;

	public Product(int id, String name, int price, String category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product Id=" + id + ", Product Name=" + name + ", Price=" + price + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Product o) {
		// return this.id-o.id;//asc
		return o.id - this.id; // desc
	}

}
