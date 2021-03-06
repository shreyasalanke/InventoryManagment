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
		System.out.println("Enter a your choice  :1.Enter items in inventory. 2.Print details of specific item 3.Edit the name details 4.caclculate value of inventory.5.Wrong Input.");
		int key = scanner.nextInt();
		switch (key) 
		{
		case 1:
		{
			inventoryService.displayItems();
			break;
		}
		case 2:
		{
			System.out.println("Enter the item name to check the inventory");
			inventoryService.displayByName(scanner.next());
			break;
		}
		case 3:
		{	
			System.out.println("Enter the name of item to change its details");
		    inventoryService.editItemsByName(scanner.next());
		    break;
			
		}
		case 4:
		{
			inventoryService.calculateItems();
		    break;
			
		}
	    default:
		System.out.println("Invalid number");
	}	
 }
}