import java.util.Arrays;

public class Lesson3MissingElement {

	public static void main(String[] args) {

		Lesson3MissingElement obj = new Lesson3MissingElement();
		int A[] = {1,2};
		System.out.println("result is: " + obj.solution(A));

	}
	
	
    public int solution(int[] A) {
    	    	
    	Arrays.sort(A);
    	
    	if(A.length==0 || A[0]==2) {
    		return 1;
    	}
    	
    	if(A.length==1) {
    		return 2;
    	}
    	
    	for(int i = 1; i<A.length; i++) {
    		
    		
    		if(A[i]-A[i-1]==2) {
    			return A[i]-1;
    		}
    		
    	}
    	
		return A[A.length-1]+1;
    	

    }

}
