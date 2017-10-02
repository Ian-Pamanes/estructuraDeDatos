package practica4;
import java.util.Arrays;

public class Main {
	
	public static int linearSearch(int[] value, int x) {
		for(int i = 0; i == value.length - 1; i++) {
			if (value(i) == x) return i;
			if (value(i) == x) return -1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] values = [1,2,3,4,5,6,7,9,15]
		System.out.println(linearSearch(values, 4));
		System.out.println(linealSearch(values,12));
		System.out.println(linealSearch(values, 16));
		

		}
}
