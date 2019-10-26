import java.util.Arrays;

public class Lesson2OddOccurances {

	public static void main(String args[]) {
		
		int[] A = {1,2,3,4,5,5,4,3,2,1,6};
		Lesson2OddOccurances r = new Lesson2OddOccurances();
		System.out.println("result= " + r.solution(A));
	}
	
    public int solution(int[] A) {
		
    	int result = A[0];
    	
    	Arrays.sort(A);
    	
    	System.out.println("after sort: ");  	
    	for(int i=0; i<= A.length-1; i++) {
    		System.out.print(A[i] + " ");
    	}
    	System.out.println(" ");
    	
    	int counter = 1;
    	
    	for(int i=1; i<= A.length-1; i++) {
    		
    		if(A[i]==A[i-1]) {
    			counter++;
    			System.out.println(i + " interation, counter = " + counter);
    		}else {
    			if (counter%2==1) {
    				result = A[i-1];
    				break;		
    			}
    			counter = 1;
    		}
    		
    		if( (counter > 2 || counter ==1) && i== A.length-1) {
    			result = A[A.length-1];
    		}
    		 		
    	}
    	
    	return result;
       
    }
	
}
