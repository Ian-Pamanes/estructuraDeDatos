package examen2;
import java.util.Arrays;

public class Main {
	
	public static String reverseParenthesis(String string) {
		Stack<Character> reverseStack = new Stack<Character>();
		String reversedString = "";
		String ogString = string;
		boolean reverseFlag = false;
		int reverseIndex = 0;
		int stopReverseIndex = 0;
		while(string.contains("(")){
		for(int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '(') {
				reverseFlag = true;
				reverseStack.clear();
				reverseIndex = i;
				i++;}
			if (string.charAt(i) == ')') {
				stopReverseIndex = i;
				break;}
			if(reverseFlag) {
				reverseStack.push(string.charAt(i));}
		}
		
		for(int i = 0; i < string.length(); i++ ) {
			if(i != reverseIndex ) {
				if(i != stopReverseIndex) {
				reversedString += string.charAt(i);	
				System.out.println(reversedString);}
				
			}

			else {
				for(int j = 0; j <= reverseStack.size(); j++) {
					System.out.println(Arrays.toString(reverseStack.toArray()));
					reversedString += reverseStack.pop();
					System.out.println(reversedString);
				}
			i= stopReverseIndex;
			}
		}
		System.out.println(reversedString);
		string = reversedString;
		reversedString = "";
		}
	reversedString = string;	
	string = ogString;
	return reversedString;
	}
	

	
	public static void main(String[] args) {
		
		String string = "a(bc(de)fg)h";

		
		System.out.println(reverseParenthesis(string));

		

		}
}