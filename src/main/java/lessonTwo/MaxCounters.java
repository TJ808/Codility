package lessonTwo;

public class MaxCounters {
		
	public int[] solution(int N, int[] A) {
		
		int max = 0;
		int lastUpdate = 0;
		int[] counter = new int[N];
		
		for(int i = 0; i < A.length; ++i) {
			
			int currentVal = A[i];
			
			// Set lastUpdate to current max value of any element in counter array
			if(currentVal == N + 1) {
				lastUpdate = max;
			}
			
			else if(currentVal >= 1 && currentVal <= N) {
				
				int position = currentVal - 1;
				
				// check if update operation has been called previously. if it has
				// add 1 to the lastUpdate value
				if(counter[position] < lastUpdate) {
					counter[position] = lastUpdate + 1;
				}
				
				// if max counter hasn't been called, just increment value by 1
				else {
					counter[position]++;
				}
				
				// Condition to find current max value in counter array
				if(counter[position] > max) {
					max = counter[position];
				}
			}
		}
		
		// If an element in counter has a value less than lastUpdate, set that elements
		// value to be equal to lastUpdate
		for(int j = 0; j < counter.length; ++j) {
			if(counter[j] < lastUpdate) {
				counter[j] = lastUpdate;
			}
		}

		return counter;
	}

	public static void main(String[] args) {
		
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		int [] solution = new MaxCounters().solution(5, A);

		for(int num : solution) {
			System.out.print(num + " ");
		}
	}
}
