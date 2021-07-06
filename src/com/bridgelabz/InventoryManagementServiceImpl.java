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

}
