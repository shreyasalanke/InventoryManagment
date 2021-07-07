package com.bridgelabz;

public class Items {
	
	private String itemNames;
	private double itemWeight;
	private double itemPricePerKg;
	
	public String getItemNames() {
		return itemNames;
	}
	public void setItemNames(String itemNames) {
		this.itemNames = itemNames;
	}
	public double getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}
	public double getItemPricePerKg() {
		return itemPricePerKg;
	}
	public void setItemPricePerKg(double itemPricePerKg) {
		this.itemPricePerKg = itemPricePerKg;
	}
   @Override
   public String toString()
	{
		return "Items [itemName=" + itemNames + ", itemWeight=" + itemWeight + ", itemPricePerKg=" + itemPricePerKg
				+ "]";
	}
	
}
