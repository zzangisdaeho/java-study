package com.kh.example.chap01.model;

public class Product {
	private String mName;
	private int mPrice;
	private boolean mIsFood;
	private String mMadeBy;
	private String mStore;

	public Product(String name, int price, boolean food, String madeby, String storeName) {
		mName = name;
		mPrice = price;
		mIsFood = food;
		mMadeBy = madeby;
		mStore = storeName;
	}

	public String getName() {
		return mName;
	}

	public int getPrice() {
		return mPrice;
	}

	public boolean isFood() {
		return mIsFood;
	}

	public String getMadeBy() {
		return mMadeBy;
	}

	public String getStore() {
		return mStore;
	}
}
