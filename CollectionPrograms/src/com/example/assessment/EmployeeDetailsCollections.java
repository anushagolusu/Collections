package com.example.assessment;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class EmployeeDetailsCollections {

		int empId;
		String empName;

		static Map<Integer, String> empCollection = new HashMap<Integer, String>();

		public EmployeeDetailsCollections() {
			super();
		}

		public EmployeeDetailsCollections(int empId, String empName, Map<Integer, String> empCollection) {
			super();
			this.empId = empId;
			this.empName = empName;
			
		}

		public static void addEmployee(int empId, String empName) {
			empCollection.put(empId, empName);
		}

		public static String getEmpIdByName(String empName) {
			
			String res = "";

			for (Map.Entry<Integer, String> entry : empCollection.entrySet()) {
				if (entry.getValue().equals(empName)) {
					res += entry.getKey() + "\n";
				}
			}

			return res;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number employee to be added");
			int size = sc.nextInt();
			System.out.println("enter the employee details");
			for (int i = 0; i < size; i++) {
				addEmployee(sc.nextInt(), sc.next());
			}

			System.out.println("enter the empName to get empId" );
			System.out.println(getEmpIdByName(sc.next()));

		}

	}


