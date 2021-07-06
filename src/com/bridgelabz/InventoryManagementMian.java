package com.bridgelabz;

import java.util.Scanner;

public class InventoryManagementMian {
    public static void main(String[] args) {
    	InventoryManagementService inventoryService = new InventoryManagementServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("welcome to inventory management system");
		System.out.println("enter the num of items you want to add: ");
		
		int numOfItems = scanner.nextInt();
		
		for(int index = 0; index < numOfItems; index++) {
			Items newItem = new Items();
			System.out.println("enter the name of item:");
			newItem.setItemNames(scanner.next());
			System.out.println("enter the item weight:");
			newItem.setItemWeight(scanner.nextDouble());
			System.out.println("enter the price per kg:");
			newItem.setItemPricePerKg(scanner.nextDouble());
			inventoryService.addInventoryItems(newItem);
		}
	}
}
