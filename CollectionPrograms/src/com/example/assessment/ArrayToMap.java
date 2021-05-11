package com.example.assessment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayToMap {

		public static Map<Integer, String> convertToMap(String[] names) {
			Map<Integer, String> namesMap = new HashMap<Integer, String>();

			if (names.length < 1) {
				System.out.println("Given array is Null");
			} else {
				int num = 1;
				for (int i = 0; i < names.length; i++) {
					namesMap.put(num, names[i]);
					num++;
				}
			}

			return namesMap;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);

			String[] names = new String[5];

			System.out.println("enter the names");
			for (int i = 0; i < names.length; i++) {
				names[i] = sc.next();
			}

			Map<Integer, String> map = convertToMap(names);

			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println("Key : " + entry.getKey() + " Name : " + entry.getValue());
			}

		}

	}


