package com.demo.test;

import com.demo.hashing.HashTable;

public class TestHashTable {

	public static void main(String[] args) {
		HashTable table=new HashTable(5);
		table.insertData(50);
		table.insertData(51);
		table.insertData(30);
		table.insertData(42);
		table.insertData(47);
		table.insertData(4);
		table.displayData();
		
		System.out.println("Find 30 "+table.searchData(30));
		System.out.println("Find 4 "+table.searchData(4));
		System.out.println("Find 47 "+table.searchData(47));
		

	}

}
