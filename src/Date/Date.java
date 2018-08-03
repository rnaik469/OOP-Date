package Date;

import java.text.SimpleDateFormat;

public class Date {
	// Instance members
	private int day;
	private int month;
	private int year;

	// Class constructor
	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// getters setters
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// to string
	public String toString() {
		String date;
		String dayString = Integer.toString(day);
		String monthString = Integer.toString(month);
		String yearString = Integer.toString(year);
		date = dayString + "/" + monthString + "/" + yearString;
		return date;
	}

	// comparing two dates and return boolean if smaller
	public boolean isSmaller(Date d) {
		boolean s = false;
		if (this.year > d.year) {
			s = true;
		} else if (this.year < d.year) {
			s = false;
		} else {
			if (this.month > d.month) {
				s = true;
			} else if (this.month < d.month) {
				s = false;
			} else {
				if (this.day > d.day) {
					s = true;
				} else if (this.day < d.day) {
					s = false;
				} else {
					s = false;
				}
			}
		}
		return s;
	}

	// returns day month and year
	public int[] diff(Date d) {
		String secondDate = d.toString();
		String firstDate = this.toString();
		int differenceArray[] = new int[3];
		try {
			java.util.Date firsDate = new SimpleDateFormat("dd/MM/yyyy").parse(firstDate);
			java.util.Date seconDate = new SimpleDateFormat("dd/MM/yyyy").parse(secondDate);

			long diff = seconDate.getTime() - firsDate.getTime();

			differenceArray[0] = (int) (diff / (24 * 60 * 60 * 1000));//converts time into day
			differenceArray[1] = (int) (differenceArray[0] / 30);	//converts day into months
			differenceArray[2] = (int) (differenceArray[1] / 12);	//converts months into years

		} catch (Exception e) {
			e.printStackTrace();
		}
		return differenceArray;
	}

}
