package com.bikkadIT;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Shop {

	private int shopId;

	private List<String> books;

	private Set<String> mobiles;

	private Map<String, String> pens;

	public Shop() {
		super();
		System.out.println("Shop class Constructor");
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public Set<String> getMobiles() {
		return mobiles;
	}

	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}

	public Map<String, String> getPens() {
		return pens;
	}

	public void setPens(Map<String, String> pens) {
		this.pens = pens;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", books=" + books + ", mobiles=" + mobiles + ", pens=" + pens + "]";
	}

}
