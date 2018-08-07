package com.typeinference;

public class PrimitiveTypes {

	public static void main(String[] args) {

		var years = 37; // this primitive var declaration was changed
		var gender = 'M'; // this primitive var declaration was changed

		if ( gender == 'M' ) {
			System.out.println( "Hi Mister, you're " + years + " old " );
		}
		else if ( gender == 'F' ) {
			System.out.println( "Hi Miss, you're " + years + " old " );
		}
		else {
			System.out.println( "Hi, you're " + years + " old " );
		}

		var totalPayment = 6200d; // this primitive var declaration was changed
		var days = 85; // this primitive var declaration was changed

		var value = totalPayment / days;  // this primitive var declaration was changed

		System.out.println( "Last month you earned $ " + value + " per day " );

		for ( var i = 0 /* this one too */; i < 10; i++ ) {

			var isEven = i % 2 == 0; // this one too

			if ( isEven ) {
				System.out.println( i + " is an even number " );
			}
			else {
				System.out.println( i + " is an odd number " );
			}

		}

	}
}
