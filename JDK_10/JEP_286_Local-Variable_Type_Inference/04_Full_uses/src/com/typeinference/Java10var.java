package com.typeinference;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
* This class has some variable declarations that can't be changed for Java 10 type inference way,
* you should try to change whichever you think can use var, and then compile to check if your changes are correct
* */
public class Java10var {

	public ZoneId zoneIdAraucaColombia = ZoneId.of( "GMT-5" );
	public ZoneId zoneIdIstanbulTurkey = ZoneId.of( "GMT+3" );
	public ZoneId zoneIdLondonUK = ZoneId.of( "GMT+1" );

	public static void main(String args[]) {

		Java10var java10var = new Java10var();
		List<Long> numberss = List.of( 13L, 11L, 12L, 13L, 10L, 15L, 12L, 11L, 10L );

		Double average = java10var.average( numberss );
		System.out.println( "Average is: " + average );

		Long first = java10var.getFirst( numberss );
		System.out.println( "The first number in the list is: " + first );

		java10var.printTimes();

		printMonth();

		printNumbers();
	}

	public Double average(List<Long> numberss) {
		var average = 0D;
		var sum = numberss.stream().mapToDouble( p -> p ).sum();
		average = sum / numberss.size();
		return average;
	}

	public Long getFirst(List<Long> numberss) {
		var first = numberss.get( 0 );
		return first;
	}

	public void printTimes() {
		var localDateTimeAraucaColombia = LocalDateTime.now( zoneIdAraucaColombia );
		var localDateTimeIstanbulTurkey = LocalDateTime.now( zoneIdIstanbulTurkey );
		var localDateTimeLondoUK = LocalDateTime.now( zoneIdLondonUK );

		System.out.println( "Current time in Arauca - Colombia is: " + localDateTimeAraucaColombia );
		System.out.println( "Current time in Istanbul - Turkey is: " + localDateTimeIstanbulTurkey );
		System.out.println( "Current time in London - United Kingdom is: " + localDateTimeLondoUK );
	}

	public static void printMonth() {
		var monthValue = LocalDate.now().getMonthValue();

		var months = new HashMap<>();
		for(var month:Month.values()){
			months.put( month.getValue(), month.name() );
		}

		var monthName = months.get( monthValue );

		System.out.println( "monthName: " + monthName );
	}

	public static void printNumbers() {
		var myList = new ArrayList<>();
		myList.addAll( List.of("ONE","TWO","THREE","FIVE","SEVEN", "ELEVEN", "THIRTEEN", "SEVENTEEN" ) );

		System.out.println( myList );

		myList = new LinkedList<>();
		myList.addAll( List.of("1" , "2" , "3" , "5" , "7" , "11" , "13" , "17" ));

		System.out.println( myList );
	}
}
