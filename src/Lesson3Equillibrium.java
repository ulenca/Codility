
public class Lesson3Equillibrium {

	public static void main(String[] args) {
			int A[]= {10,5,5,10,0,0,0,-1};
			Lesson3Equillibrium obj = new Lesson3Equillibrium();
			System.out.println("minimal difference= " + obj.solution(A));
			
	}

	
    public int solution(int[] A) {

    	int l = A.length;
    	int first = A[0];
    	int last = A[l-1];
    	
    	if(l==2) {
    		return Math.abs(first-last);
    	}
    	
    	int counter = l-2;
    	int leftIndex = 1;
    	int rightIndex = l-2;
    	
    	while(counter > 0) {
    		
    		if(Math.abs(first+A[leftIndex]-last)<Math.abs(first-(last+A[rightIndex]))) {
    				first = first + A[leftIndex];
    				leftIndex++;
    		}else{
    				last = last+A[rightIndex];
    				rightIndex--;
    			}
    		counter--;
    		
    		System.out.println("first = " + first + " last = " + last + " counter = " + counter);
    	}
    	
    	return Math.abs(first-last);
    	
    }
}
