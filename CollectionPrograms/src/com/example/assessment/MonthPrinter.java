package com.example.assessment;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

	public class MonthPrinter {
		
		public static String getMonthCalendar(int month, int year) {
			
			YearMonth ym = YearMonth.of(year, month);
			int totalDays = ym.lengthOfMonth();
			String firstDay = ym.atDay(1).getDayOfWeek().name();
			 String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
			 
			 String res = "1 : " +firstDay+ " " +totalDays+ ": "+lastDay;
			 return res;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter year ");
			int year = sc.nextInt();
			System.out.println("enter month");
			int month = sc.nextInt();
			
			System.out.println(getMonthCalendar(month,year));

		}

	}


