import java.util.Arrays;

public class Lesson4Permutation {

	public static void main(String[] args) {

		Lesson4Permutation obj = new Lesson4Permutation();
		int A[]= {2};
		System.out.println("Result is: " + obj.solution(A));

	}

	
    public int solution(int[] A) {

    	Arrays.sort(A);
    	int l = A.length;
    	
    	if(A[0]!=1 || A[l-1]!=l) {
    		return 0;
    	}
    	
    	for (int i = 1; i<l; i++) {
    		if (A[i]-A[i-1]!=1){
    			return 0;
    		}
    	}
    	
    	return 1;
    	
    }
}
