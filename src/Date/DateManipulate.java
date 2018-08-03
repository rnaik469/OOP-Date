package Date;

import java.util.Scanner;

public class DateManipulate {

// ...............METHOD TO COMPARE SMALLER DATE......	
	public static void smallerDateCompare(Date date, int daySecond, int monthSecond, int yearSecond) {

		Date compareDate = new Date(daySecond, monthSecond, yearSecond); // Making new object to compare
		boolean checkSmall = date.isSmaller(compareDate);
		if (checkSmall)
			System.out.println("the original date is latest.");
		else
			System.out.println("the original date is older or equal.");

	}

//...........METHOD TO FIND DIFFERENCE...........	
	public static void dateDifference(Date date, int daySecond, int monthSecond, int yearSecond) {

		Date secondDate = new Date(daySecond, monthSecond, yearSecond); // Making new object to compare
		int difference[] = date.diff(secondDate);

		System.out.println("Difference in days: " + difference[0]);
		System.out.println("Difference in month: " + difference[1]);
		System.out.println("Difference in year: " + difference[2]);

	}

//........MAIN FUNCTION.............
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the day, month and year....");
		int day = scanner.nextInt();
		int month = scanner.nextInt();
		int year = scanner.nextInt();

		// .......Instatiating Class Date.......
		Date date = new Date(day, month, year);

		// ......RETURN THE VALUE OF DATE IN D/M/Y FORMAT......
		String dateValue = date.toString();
		System.out.println("the date is " + dateValue);

		System.out.println("Enter the day, month and year to compare....");
		int daySecond = scanner.nextInt();
		int monthSecond = scanner.nextInt();
		int yearSecond = scanner.nextInt();
		// .......DIFFERENCE BETWEEN TWO DATES...........
		dateDifference(date, daySecond, monthSecond, yearSecond);

		// .......CHECK SMALLER DATE...........
		smallerDateCompare(date, daySecond, monthSecond, yearSecond);
		scanner.close();
	}

}
