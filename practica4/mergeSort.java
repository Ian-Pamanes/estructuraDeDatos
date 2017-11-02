
public class mergeSort {

	
	public static void mergesort(int[] values, int[] scratch, int start, int end ) {
		if(start >= end) return;
		int midpoint = (start + end)/2;
		
		mergesort(values, scratch, start, midpoint);
		mergesort(values, scratch, midpoint + 1, end);
		
		int leftIndex = start;
		int rightIndex = midpoint + 1;
		int scratchIndex = leftIndex;
		
		while (leftIndex <= midpoint && rightIndex <= end ) {
			if (values[leftIndex] <= values[rightIndex]) {
				scratch[scratchIndex++] = values[leftIndex++];
			}
			else {
				scratch[scratchIndex++] = values[rightIndex++];
			}
		}
		
		for (int i = rightIndex; i <= end; i++) {
			scratch[scratchIndex] = values[i];
			scratchIndex++;
		}
		
		for (int i = start; i <= end; i++) {
			values[i] = scratch[i];
		}
		
	}
	
	public static void main(String[] args) {
		int uArray[] = {3,2,1,423,63,2,63};
		int scratch[] = new int[uArray.length];
		mergesort(uArray, scratch, 0, uArray.length - 1);
	}

}
