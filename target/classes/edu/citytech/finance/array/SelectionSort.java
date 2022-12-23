package edu.citytech.finance.array;

// Java program for implementation of Selection Sort
public class SelectionSort
{
	public static  <T extends Comparable<T>> void sort(T arr[]){

		sort(arr,arr.length);
	}

	public static  <T extends Comparable<T>> void sort(T arr[], int length)
	{
		int n = length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				//if (arr[j] < arr[min_idx])
				if (arr[j].compareTo(arr[min_idx]) <0)
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			T temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	public static <T extends Comparable<T>> void printArray(T arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}

