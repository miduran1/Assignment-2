/**
 * Michael Duran
 * PIN: 22
 * CSE 360
 * Assignment 2: Analytics.java
 * This class inherits from OrderedIntList.java and has functions to calculate the mean,
 * median, highest value, lowest value, and number of elements in the array.
 */

// This is the package Analytics.java is contained in.
package cse360assign2;

public class Analytics extends OrderedIntList // Inheriting from OrderedIntList.java
{
	Analytics () // Constructor
	{
		super(); // Inherits fields from OrderedIntList.java
	}
	
	/**
	 * The mean() function returns the average of the values found in the array as a double.
	 * If the list is empty it returns -1.
	 * 
	 * @return	double value of mean
	 */
	public double mean ()
	{
		double total = 0;
		int count = 0;
		
		for(int index = 0; index < array.length; index++)
		{
			if (array[index] != 0) // checks if array element is not empty and adds to total and count
			{
				total = total + array[index];
				count++;
			}
		}
		
		if (count == 0) // returns -1 if list is empty.
			return -1;
		else
		{
			return (total/count); // returns mean.
		}
	}
	
	/**
	 * The median() function returns the median value of the array as an integer. If there is an even number of elements,
	 * the function will return the average of the two middle integers as an integer. If the list is empty it returns -1.
	 * 
	 *  @return	integer value of median
	 */
	public int median ()
	{
		int count = 0;
		
		for(int index = 0; index < array.length; index++)
		{
			if (array[index] != 0) // counts the number of elements in list.
				count++;
		}
		
		if (count == 0) // if list is empty return -1.
			return -1;
		else
		{
			if (count % 2 == 1) // return middle element if array has odd number of elements.
				return array[count / 2];
			else // return average of two middle elements if number of elements is even.
				return (array[(count / 2) - 1] + array[count / 2]) / 2;
		}
	}
	
	/**
	 * The high() function returns the highest element of the array. Since the array is sorted as elements are inserted,
	 * it will return the last element of the array. If the list is empty it returns -1.
	 * 
	 * @return integer value of highest element
	 */
	public int high ()
	{
		int count = 0;
		
		for(int index = 0; index < array.length; index++)
		{
			if (array[index] != 0) // counts the number of elements in list.
				count++;
		}
		
		if (count == 0) // if list is empty return -1.
			return -1;
		else // return last element which is pre-sorted to be the highest
			return array[count - 1];
	}
	
	/**
	 * The low() function returns the lowest element of the array. Since the array is sorted as elements are inserted,
	 * it will return the first element of the array. If the list is empty it returns -1.
	 * 
	 * @return integer value of lowest element
	 */
	public int low ()
	{
		int count = 0;
		
		for(int index = 0; index < array.length; index++)
		{
			if (array[index] != 0) // counts the number of elements in list.
				count++;
		}
		
		if (count == 0) // if list is empty return -1.
			return -1;
		else // return first element which is pre-sorted to be the lowest
			return array[0];
	}
	
	/**
	 * The numInts() function returns the total number of element of the array.
	 * If the list is empty it returns 0.
	 * 
	 * @return number of elements as integer
	 */
	public int numInts ()
	{
		int count = 0;
		
		for(int index = 0; index < array.length; index++)
		{
			if (array[index] != 0) // count the number of elements in the list
				count++;
		}
		
		return count; // return the number of elements in the list
	}
}
