import java.util.Arrays;

public class Lesson2RotationArray {

	public static void main(String[] args) {

		int[] A = {0,0,0};
		int K = 4;
		
		Lesson2RotationArray obj = new Lesson2RotationArray();
		int[] B = obj.solution(A, K);
		
		System.out.print("A= ");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i] + ", ");
		}
		
		System.out.print("B= ");
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i] + ", ");
		}


	}
	
    public int[] solution(int[] A, int K) {
    	
    	int[] result = Arrays.copyOf(A, A.length);
	
    	for(int i=1; i<=K; i++) {
    		
        	int last = result[result.length-1];
        	int temp;
    		for(int j=result.length-1; j>0; j--) {
    			
    			result[j]=result[j-1];

    		}
    		
    		result[0] = last;
    		
    		System.out.print(i + " shift B= ");
    		for(int k=0;k<result.length;k++) {
    			System.out.print(result[k] + ", ");
    		}
    		System.out.println(" ");
    		
    	}
    	
		return result;

    }

}
