
public class Lesson4Frog {

	public static void main(String[] args) {

		
		int A[] = {1,2};
        int X = 5;
        Lesson4Frog obj = new Lesson4Frog();
        System.out.println("Result is: " + obj.solution(X, A));
	}
	
    public int solution(int X, int[] A) {

    	
    	Integer B[] = new Integer[X];
        int counterOfEmptyFieldsInB = B.length;
    	
    	for(int i=0; i<A.length; i++) {
    		
    		if(B[A[i]-1] == null) {
    			B[A[i]-1]=A[i];			
    			counterOfEmptyFieldsInB--;
    			
    		}
    		
			//System.out.println(i+ " iteration, A[i=]" + A[i] + " ,B[" + (A[i]-1) +"]=" + B[A[i]-1] + " ,counter= "+ counterOfEmptyFieldsInB);
			
			if(counterOfEmptyFieldsInB==0) {
				return i;
			}
    		
    	}
    	
    	
    	return -1;
    	
    }

}
