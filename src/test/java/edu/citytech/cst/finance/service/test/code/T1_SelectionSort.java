package edu.citytech.cst.finance.service.test.code;
import edu.citytech.finance.service.IntegerBinarySearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static edu.citytech.finance.array.SelectionSort.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
// Java program for implementation of Selection Sort

@DisplayName("SelectionSort.insert by Mohamed Kaba")
public class T1_SelectionSort
{

	@Test
	@DisplayName("sort search for 64 ")
	public void t0(){
		Integer arr[] = {64,25,12,22,11};
		sort(arr);

		var expected= 64;
		var actual= arr[arr.length-1];

		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("sort search for 11 ")
	public void t1(){
		Integer arr[] = {64,25,12,22,11};
		sort(arr);

		var expected= 11;
		var actual= arr[0];

		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("sort search for 'O' ")
	public void t2(){
		String arr[] = {"H","K","A","F","O"};
		sort(arr);
		printArray(arr);

		var expected= "O";
		var actual= arr[arr.length-1];

		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("sort search for the middle character in the array ")
	public void t3(){
		String arr[] = {"H","K","A","F","O"};
		sort(arr);

		var expected= "H";
		var actual= arr[(arr.length-1)/2];
		assertEquals(expected,actual);
	}

	@Test
	@DisplayName("sort a list, and using binarySearch Algorithm to find the index of 5 ")
	public void t4(){
		Integer arr[] = {55,5,32,10,1};
		sort(arr);
		int[] intArray = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();

		var expected= 1;
		var actual=  IntegerBinarySearch.binarySearch(5, intArray);

		assertEquals(expected,actual);
	}

	@Test
	@DisplayName("sort search for before last element in array ")
	public void t5(){
		Integer arr[] = {2,45,56,12,101,3,54};
		sort(arr);


		var expected= 56;
		var actual= arr[arr.length-1-1];

		assertEquals(expected,actual);
	}

//	public static void main(String args[])
//	{
//
//		String arr2[] = {"Z","F","A","B","C"};
//		sort(arr2);
//		System.out.println("Sorted array (2)");
//		printArray(arr2);
//
//		Student arr3[] = {
//				new Student("001",4.00f),
//				new Student("002",4.01f),
//				new Student("002",5.00f),
//				new Student("002",3.01f),
//				new Student("002",1.01f)
//		};
//		sort(arr3);
//		System.out.println("Sorted array (2)");
//		printArray(arr3);
//	}
}
/* This code is contributed by Rajat Mishra*/
