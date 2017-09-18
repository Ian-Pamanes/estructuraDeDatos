package practica4;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Testing array reversing");
		int[] ñ = {1, 2, 3, 4, 5};
                Stack<Integer> inputArray= new Stack<>();   
                
                for(int i = 0; i!=ñ.length; i++){
                    inputArray.push(ñ[i]);
                    
                }
                System.out.println("Input: " + Arrays.toString(inputArray.toArray()));

		
		Stack<Integer> outputArray= new Stack<>(); 
                for(int i = 0; i!=ñ.length; i++){
                    outputArray.push(inputArray.pop());
                }
		
		// TODO: pop every item in inputArray and save them in outputArray
		
		System.out.println("Output: " + Arrays.toString(outputArray.toArray()));
		System.out.println();
		
		System.out.println("Testing train ordering");
		Stack<Integer> train = new Stack<Integer>();
		train.push(3);
		train.push(2);
		train.push(1);
		train.push(3);
		train.push(2);
		
		System.out.println("Train as it arrived to the station: " + Arrays.toString(train.toArray()));
		
		// TODO: sort the wagons in priority order
                
		Stack<Integer> holdingOne = new Stack<Integer>();
		Stack<Integer> holdingTwo = new Stack<Integer>();
		Stack<Integer> outputTrack = new Stack<Integer>();
                
                for(int i = 0; i != 5; i++){
                    
                    if (train.peek()==3){holdingOne.push(train.pop());}
                    else if (train.peek()==2){holdingTwo.push(train.pop());}
                    else if (train.peek()==1){outputTrack.push(train.pop());}
                }
                
                train.push(holdingOne.pop());
                train.push(holdingOne.pop());
                train.push(holdingTwo.pop());
                train.push(holdingTwo.pop());
                train.push(outputTrack.pop());
                
		System.out.println("Train ordered by priority: " + Arrays.toString(train.toArray()));
		System.out.println();
                
                
                
                // ----------------------------------------------------------------------------------------
		
		Stack<Integer> towerOne = new Stack<Integer>();
		Stack<Integer> towerTwo = new Stack<Integer>();
		Stack<Integer> towerThree = new Stack<Integer>();
		
		towerOne.push(3);
		towerOne.push(2);
		towerOne.push(1);
		
		System.out.println("At the beginning");
		System.out.println("Hanoi tower #1: " + Arrays.toString(towerOne.toArray()));
		System.out.println("Hanoi tower #2: " + Arrays.toString(towerTwo.toArray()));
		System.out.println("Hanoi tower #3: " + Arrays.toString(towerThree.toArray()));
		
		towerTwo.push(towerOne.pop());
                towerThree.push(towerOne.pop());
                towerThree.push(towerTwo.pop());
                towerTwo.push(towerOne.pop());
                towerOne.push(towerThree.pop());
                towerTwo.push(towerThree.pop());
                towerTwo.push(towerOne.pop());
                
		
		System.out.println("At the end");
		System.out.println("Hanoi tower #1: " + Arrays.toString(towerOne.toArray()));
		System.out.println("Hanoi tower #2: " + Arrays.toString(towerTwo.toArray()));
		System.out.println("Hanoi tower #3: " + Arrays.toString(towerThree.toArray()));
		System.out.println();
	}
}
