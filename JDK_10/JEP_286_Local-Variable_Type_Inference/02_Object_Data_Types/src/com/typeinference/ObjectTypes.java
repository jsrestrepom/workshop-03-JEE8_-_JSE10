package com.typeinference;

import java.util.Arrays;
import java.util.List;

public class ObjectTypes {

	public static void main(String[] args) {

		var years = 37; // this object var declaration was changed
		var gender = "FEMALE"; // this object var declaration was changed

		if ( gender.equals( "MALE" ) ) {
			System.out.println( "Hi Mister, you're " + years + " old " );
		}
		else if ( gender.equals( "FEMALE" ) ) {
			System.out.println( "Hi Miss, you're " + years + " old " );
		}
		else {
			System.out.println( "Hi, you're " + years + " old " );
		}

		var totalPayment = Double.valueOf(6200D); // this object var declaration was changed
		var days = Long.valueOf(85L); // this object var declaration was be changed

		var value = Double.valueOf(totalPayment / days);  // this object var declaration was  changed

		System.out.println( "Last month you earned $ " + value + " per day " );

		var theLordOfTheRings = new Book("The Lord Of The Rings", 19.99);
		var centralPark = new Store( "Central Park");

		System.out.println( "Your favorite book " + theLordOfTheRings + ", is available in our store " + centralPark.getName() );


		var animalss = Arrays.asList( "DOG", "CAT", "MOUSE"); // also was changed
		System.out.println(animalss);

		//Checking objects' class
		System.out.println( " " );
		System.out.println( "totalPayment is an instance of " + totalPayment.getClass() );
		System.out.println( "days is an instance of " + days.getClass() );
		System.out.println( "value is an instance of " + value.getClass() );
		System.out.println( "theLordOfTheRings is an instance of " + theLordOfTheRings.getClass() );
		System.out.println( "centralPark is an instance of " + centralPark.getClass() );
		System.out.println( "animalss is an instance of " + animalss.getClass() );
	}
}
