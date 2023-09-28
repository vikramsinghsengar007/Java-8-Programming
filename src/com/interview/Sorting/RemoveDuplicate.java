package com.interview.Sorting;

public class RemoveDuplicate {

	public static void main(String args[]){
		int array[] = { 10, 20, 30, 20, 40, 40, 50, 60, 50, 80 };
		int size = array.length;

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (array[i] == array[j]) // checking one element with all the
				// element
				{
					while (j < (size) - 1) {
						array[j] = array[j + 1];// shifting the values
						j++;
					}
					size--;
				}
			}
		}

		for (int k = 0; k < size; k++) {
			System.out.print(array[k]+" "); // printing the values
		}
	}
}