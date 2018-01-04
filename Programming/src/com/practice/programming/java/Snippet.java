package com.practice.programming.java;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Snippet {
	public void testClone () throws CloneNotSupportedException
	{
		Snippet snippetTest = (Snippet) super.clone ();
	}
	
	
	public static void main(String a[]) throws CloneNotSupportedException {
		Map<String, String> wordMap = new HashMap<String, String>();
		wordMap.put("1", "PRITI");
		wordMap.put("2","PRIYA");
		wordMap.put("3", "ABHISHEK");
		
		Snippet snippet = new Snippet ();
		Snippet snippet1 = (Snippet) snippet.clone();
		
		
		Set<Entry<String, String>> set = wordMap.entrySet();
		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(set);
		System.out.println("Set elements are as follows -->"+set.toString());
		Iterator setItr = set.iterator();
		while (setItr.hasNext())
		{
			System.out.println("Set individual elements are as follows -->"+setItr.next());	
		}
		System.out.println("List elements -->"+list.toString());
		Iterator itr = list.iterator();
		while (itr.hasNext())
		{
			System.out.println("List individual elements are as follows -->"+itr.next());	
		}
		
		Hashtable hashTable = new Hashtable ();
		hashTable.put(1, 12);
		hashTable.put(2, 22);
		hashTable.put(3, 32);
		hashTable.put(5,42);
		hashTable.put(1, 52);
		System.out.println("Hashtable value-->"+hashTable.toString());
		
		
		HashMap hashMap = new HashMap ();
		hashMap.put(null, null);
		hashMap.put(null, 2);
		hashMap.put(null, 3);
		hashMap.put(null, 4);
		hashMap.put(1, 5);
		System.out.println("HashMap values -->"+hashMap.toString());
	}
}