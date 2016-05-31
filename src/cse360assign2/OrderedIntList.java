/**
 * Michael Duran
 * PIN: 22
 * CSE 360
 * Assignment 2: OrderedIntList.java
 * This class is designed to sort and insert integers into an array, grow the array
 * as necessary, and print the values in the array when called.
 */

// This is the package OrderedIntList.java is contained in.
package cse360assign2;

// Importing Scanner in order to read user input.
import java.util.Scanner;

public class OrderedIntList 
{
	// Private variables.
	protected int[] array;  
	protected int count;
	private boolean debug;
	
	// Constructor.
	OrderedIntList ()
	{
		array = new int[10];
		debug = true;
		
		Scanner in = new Scanner(System.in); // Create scanner objec to detect if user wants to debug.
		
		System.out.println("Debugging on? Enter y or n");
		String result = in.nextLine();
		debug = result.charAt(0) == 'y'; // User enters 'y' sets debug to true, else false.
		System.out.println();
	}
	
	/**
	 * The insert() function inserts and sorts a new integer into the existing array.
	 * @param newInteger
	 */
	public void insert (int newInteger) 
	{
		if (debug) // Debugging
		{
			System.out.println("Debugging: insert()");
			System.out.println("           newInteger = " + newInteger);
		}
		
		if (count == array.length) // If current count equals the length of array, we call grow() to increase the size of the array.
			grow();
		
		if (count == 0) // If the current count is 0, the new integer is added to the first element of the array.
		{
			if(debug) // Debugging shows that the current array is empty.
			{
				System.out.println("           List is empty!");
				System.out.println("           array[0] = " + newInteger);
				System.out.println();
			}
			
			array[0] = newInteger;
			count++;
		}
		else // If count > 0, then the new integer is sorted into the array.
		{
			int jIndex = 0;
			boolean done = false;
			
			while (!done && jIndex < count) // This while loop searches for the correct index to place newInteger.
			{
				if(newInteger < array[jIndex]) // If newInteger is less than the current element, we have found its correct position.
				{
					done = true;
					
					if(debug) // Debugging shows which position holds a higher value than newInteger.
						System.out.println("           newInteger < array[" + jIndex + "]");
				}
				else // Otherwise increment the index.
					jIndex++;
			}
			
			if(debug && !done) // Debugging shows that newInteger is the highest value.
				System.out.println("           newInteger > all elements in list.");
			
			for (int index = count; index > jIndex; index--) // This for loop will move all elements higher than our index by 1 to make room for the newInteger.
				array[index] = array[index - 1];
			
			array[jIndex] = newInteger; // Insert newInteger into its position.
			count++; // Increment count.
			
			if (debug) // Debugging shows where the newInteger is being placed into the array.
			{
				System.out.println("           array[" + jIndex + "] = " + newInteger);
				System.out.println();
			}
		}
	}
	
	/**
	 *  The grow() function increases the max number of elements we can hold in our 
	 *  array by count * 2. This is called from the insert() function.
	 */
	private void grow ()
	{
		if (debug) // Debugging shows the current size of the array.
		{
			System.out.println("Debugging: grow()");
			System.out.println("           Current array size: " + array.length);
		}
		
		int[] tempArray = new int[count * 2]; // Creates a temporary array twice the size of the current one.
		
		for (int index = 0; index < count; index++) // Assigns elements of array to tempArray.
			tempArray[index] = array[index];
		
		array = tempArray; // tempArray becomes our new array.
		
		if (debug) // Debugging shows the new size of the array.
			System.out.println("           New array size: " + array.length);
	}
	
	/**
	 * The print() function will print all current elements in the array.
	 */
	public void print () 
	{
		for (int index = 0; index < count; index++) 
		{
			if (index % 5 == 0)
				System.out.println();
			
			System.out.print(array[index] + "\t");	
		}
		
		System.out.println();
	}
}