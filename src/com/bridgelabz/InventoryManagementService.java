package com.bridgelabz;

public interface InventoryManagementService {
	public void addInventoryItems(Items items);
	 public void displayItems();
	 public void displayByName(String nameOfItem);
	 public void calculateItems();
	 public void editItemsByName(String nameOfItem);
}
