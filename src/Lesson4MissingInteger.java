import java.util.Arrays;

public class Lesson4MissingInteger {

	public static void main(String[] args) {

		int A1[] = {1, 3, 6, 4, 1, 2}; //5
		
		int A2[] = {1, 2, 3}; //4
		
		int A3[] = {-1, -3}; //1
		
		Lesson4MissingInteger lesson = new Lesson4MissingInteger();
		
		System.out.println("Result is " + lesson.solution(A3));

	}
	
	public int solution(int[] A) {
		
		Arrays.sort(A);
		int l = A.length;
		int index = 0;
		
		if(A[l-1]<1) return 1;
		
			for (int i = 0; i<l; i++) {
				if(A[i]>0) {
					index = i;
					break;
				}
			}
				
			if (A[index]!=1) {
				return 1;
			}
			
			for (int i = index+1; i<l; i++) {
				if(A[i]-A[i-1]>1) {
					return A[i-1]+1;
				}
			}
				
		return A[l-1]+1;
		
	}

}
