package dailyTasks;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Today date: " + date);

		LocalDate yesterday = date.minusDays(1);
		System.out.println("Yesterday date: " + yesterday);

		LocalDate date1 = LocalDate.of(2022, 10, 10);
		System.out.println(date1.isLeapYear());

		LocalDate date2 = LocalDate.of(2016, 10, 10);
		System.out.println(date2.isLeapYear());

	}

}
