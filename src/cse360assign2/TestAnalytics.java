/**
 * Michael Duran
 * PIN: 22
 * CSE 360
 * Assignment 2: TestAnalytics.java
 * This class contains the main() function for OrderedIntList.java and Analytics.java and is
 * used for testing the various functions in those classes.
 */

// This is the package Analytics.java is contained in.
package cse360assign2;

public class TestAnalytics 
{
	public static void main(String[] args)
	{
		Analytics test = new Analytics(); // Creates a new Analytics object.
		
		// These series of statements call the functions of test for an empty list
		System.out.println("Testing an empty list: ");
		System.out.println("           mean() = " + test.mean());
		System.out.println("           median() = " + test.median());
		System.out.println("           high() = " + test.high());
		System.out.println("           low() = " + test.low());
		System.out.println("           numInts() = " + test.numInts());
		System.out.println();
		
		// This statement prints the current elements contained in this list. (Will print nothing for empty list)
		System.out.println("Testing print(): ");
		test.print();
		
		// Using the inherited insert function from OrderedIntList.java to insert these elements into the array.
		System.out.println("Inserting: 5, 8, 7, 9, 1");
		System.out.println();
		
		test.insert(5);
		test.insert(8);
		test.insert(6);
		test.insert(9);
		test.insert(1);
		
		// These series of statements call the functions of test.
		System.out.println("Testing new list: ");
		System.out.println("           mean = " + test.mean());
		System.out.println("           median = " + test.median());
		System.out.println("           high = " + test.high());
		System.out.println("           low = " + test.low());
		System.out.println("           numInts = " + test.numInts());
		System.out.println();
		
		// This statement prints the current elements contained in this list.
		System.out.println("Testing print(): ");
		test.print();
		System.out.println();
		
		// Inserting more elements into the array to incite inherited grow() function.
		System.out.println("Inserting: 2, 15, 23, 26, 24, 17, 19");
		System.out.println();
		
		test.insert(2);
		test.insert(15);
		test.insert(23);
		test.insert(26);
		test.insert(24);
		test.insert(17);
		test.insert(19);
		
		// These series of statements call the functions of test.
		System.out.println("Testing new list: ");
		System.out.println("           mean = " + test.mean());
		System.out.println("           median = " + test.median());
		System.out.println("           high = " + test.high());
		System.out.println("           low = " + test.low());
		System.out.println("           numInts = " + test.numInts());
		System.out.println();
		
		// This statement prints the current elements contained in this list.
		System.out.println("Testing print(): ");
		test.print();
	}
}
