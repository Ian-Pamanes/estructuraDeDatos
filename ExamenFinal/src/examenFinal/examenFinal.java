package examenFinal;

import java.util.Arrays;

public class examenFinal {
	
	public static LinkedList<Integer> union(LinkedList<Integer> list1, LinkedList<Integer> list2){
		
		LinkedList<Integer> listaUnion = new LinkedList<Integer>();
		
		for(int i = 0; i<list1.size(); i++) {
			listaUnion.addLast(list1.get(i));
		}
		
		for(int i = 0; i<list2.size(); i++) {
			listaUnion.addLast(list1.get(2));
		}	
		
		return listaUnion;
		
	}
	
	public static int mystery(int m, int n) {
		if(m == 0) return n + 1;
		if(m > 0 && n == 0) return mystery(m-1,1);
		if(m > 0 && n > 0) return mystery(m-1, mystery(m, n-1));
		
		return -1;
	}
	
	public static void eraseInOrder(LinkedList<Integer> lst, int count, boolean desc) {
		if (desc) {
			for(int i = 0; i < count; i++) {
				lst.removeLast();
			}	
		}
		else {
			for(int i = 0; i < count; i++) {
				lst.removeFirst();
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(mystery(4,1));
	}
	
}
