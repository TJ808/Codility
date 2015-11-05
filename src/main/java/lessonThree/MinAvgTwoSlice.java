package lessonThree;

public class MinAvgTwoSlice {
    
    public int solution(int[] A) {
        
        int sliceStart = 0;
        double minAvg = Integer.MAX_VALUE;
        double twoSlice = Integer.MAX_VALUE;
        double threeSlice = Integer.MAX_VALUE;
        
        for(int i = 0; i <= A.length - 2; ++i) {
            
            twoSlice = (double) (A[i] + A[i + 1]) / 2.0;
            
            if(i <= A.length - 3) {
                threeSlice = (double) (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            }
            
            double slice = Math.min(twoSlice, threeSlice);
            
            if(slice < minAvg) {
                minAvg = slice;
                sliceStart = i;
            }
        }
        
        return sliceStart;
    }

    public static void main(String[] args) {

        int[] A = {5, 6, 3, 4, 9};
        System.out.println(new MinAvgTwoSlice().solution(A));
    }

}
