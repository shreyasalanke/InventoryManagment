package com.bridgelabz;

import java.util.LinkedList;

public class InventoryManagementServiceImpl implements InventoryManagementService
{
	LinkedList<Items> itemList = new LinkedList<>();
	
	public void addInventoryItems(Items items)
	{
		if (itemList.contains(items))
		{
			System.err.println("inventory item exists");
		}
		else
		{
			itemList.add(items);
		}
	}
	 public void displayItems() {
	        for (Items item : itemList)
	        {
	          System.out.println(item);
	        }
	    }
	 public void displayByName(String nameOfItem) {
	        for (Items item : itemList)
	        {
	            if(item.getItemNames().equals(nameOfItem))
	            {
	                System.out.println(item);
	                break;
	            }
	        }
	    }
	@Override
	public void calculateItems() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void editItemsByName(String nameOfItem) {
		// TODO Auto-generated method stub
		
	}
}
