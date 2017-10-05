package practica4;
import java.util.Arrays;

public class Main {
	
	public static int linearSearch(int value[], int x) {
		for(int i = 0; i == value.length - 1; i++) {
			if (value[i] == x) return i;
			if (value[i] == x) return -1;
		}
		return -1;
	}
	public static void shiftRight (int values[], int start, int end) {
		for(int i = end; i != start; i--) {
			System.out.println(i);
			values[i]=values[i-1];
		}
	}
	
	public static void insertionSort(int values[]) {
		int temp;
		for(int i = 1; i != values.length; i++) {
			for(int j = 0; j!= values.length; j++) {
				if(j < i && values[j] > values[i]) {
					temp = values[j];
					shiftRight(values, j, i);
					values[i] = temp;
				}
			}
			
			
		}
			
	}
	
	public static void selectionSort(int values[]) {
		int smallest;
		int smallestIndex;
		for(int i = 0; i < values.length; i++) {
			smallest = values[i];
			smallestIndex = i;
			for(int j = i; j < values.length; j++) {
				if(values[j] < smallest) {
					smallest = values[j];
					smallestIndex = j;
				
				}
			}	
			values[smallestIndex] = values[i];
			values[i] = smallest;
					
					
		}
	}
	
	public static void main(String[] args) {
		
		int[] values = {5,2,7,43,9,23,6,86,4,1};
		int[] values2 = {5,2,7,43,9,23,6,86,4,1};
		insertionSort(values);
		selectionSort(values2);
		System.out.println(Arrays.toString(values));
		

		}
}