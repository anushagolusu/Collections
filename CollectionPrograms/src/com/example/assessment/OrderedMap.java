package com.example.assessment;


	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class OrderedMap {
		static HashMap<Integer,String> insertionOrderMap = new HashMap<Integer,String>();
		 static void addElement(int key,String value) {
			 insertionOrderMap.put(key, value);
		 }
		 
		 static void displayOrderMap(HashMap<Integer,String> map) {
			 for(Map.Entry<Integer, String> entry: map.entrySet()) {
				 System.out.println(entry.getKey() +" " + entry.getValue());
			 }
		 }
		
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size");
			int size = sc.nextInt();
			System.out.println("enter Key and values in the map");
			for(int i = 0 ; i < size; i++) {
				addElement(sc.nextInt(),sc.next());
			}
			
			displayOrderMap(insertionOrderMap);
			
			
		}

	}


