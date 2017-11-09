package examen3;

public class examen3 {
	
	static int stringCount = 0;
	
	public static String allStar(String str) {
		
		if(str.length() == 0) return "";
		
		if (str.length() != 1){
			return (str.substring(0, 1) + "*") + allStar(str.substring(stringCount+1));}
		else {
			return (str.substring(0, 1)) + allStar(str.substring(stringCount+1));}	
	}
	
	public static String endX(String str) {
		
		if(str.length() == 0) return "";
		
		
		
		
		return"";
	}
	
	public static int maxDepth(String str) {	
		int maxDepth = 0;
		int parCounter = 0;
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ')' ) {
				if (str.charAt(i) == '(') {
					stack.push(str.charAt(i));
					parCounter ++;
					if(stack.size() > maxDepth) maxDepth = stack.size();
				}
				
			}
			if (str.charAt(i)==')') {
				stack.clear();
				parCounter--;
			}
		}
		
		return (parCounter == 0) ? maxDepth : -1;
		
	}
	
	public static LinkedList<Integer> intersect(LinkedList<Integer> list1, LinkedList<Integer> list2){
		LinkedList<Integer> intersect = new LinkedList<Integer>(); 
		boolean flag = false;
		for(int i = 0; i < list1.size(); i++) {
			flag = false;
			for(int j = 0; j < list1.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					flag = true;
				}
			}
		if(flag) intersect.addFirst(list1.get(i));		
		}
		return intersect;
	}
	
	public static LinkedList<Integer> difference(LinkedList<Integer> list1, LinkedList<Integer> list2){
		LinkedList<Integer> difference = new LinkedList<Integer>(); 
		boolean flag = true;
		for(int i = 0; i < list1.size(); i++) {
			flag = true;
			for(int j = 0; j < list1.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					flag = false;
				}
			}
		if(flag) difference.addFirst(list1.get(i));		
		}
		return difference;
	}

	public static void main(String[] args) {

		System.out.println(allStar("hello"));
		System.out.println(allStar("shrek"));
		System.out.println(maxDepth(""));
		System.out.println(maxDepth("b)(c)()"));
		System.out.println(maxDepth("(p((q))((s)t))"));
		
	}

}

