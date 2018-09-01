package doufu;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
	public static void main(String[] args) {
		
			LocalDate today = LocalDate.now();
			DayOfWeek week = today.getDayOfWeek();
			System.out.println(week);//SATURDAY
			
			int value = week.getValue();
			System.out.println(value);//6
			
			LocalDate ld= LocalDate.now();
			System.out.println(ld);
			
			LocalTime t=LocalTime.now();
			System.out.println(t);
			
			LocalDateTime dt= LocalDateTime.now();
			System.out.println(dt);
			
			LocalDate add= LocalDate.of(2018, 7, 23);
			System.out.println(add);
			
			add=add.plusDays(30);
			add=add.plusMonths(2);
			add=add.plusYears(1);
			System.out.println(add.getDayOfMonth());
			System.out.println(add.getDayOfYear());
			System.out.println(add.getDayOfWeek());
			System.out.println(add.getDayOfMonth());
			System.out.println(add.getDayOfYear());
			System.out.println(add.getDayOfWeek().getValue());
			System.out.println(add);
			System.out.println(add);
			System.out.println(add);
			
		
	}

}
