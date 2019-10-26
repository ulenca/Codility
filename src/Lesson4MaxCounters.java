import java.util.Arrays;

public class Lesson4MaxCounters {

	public static void main(String[] args) {
		
		int N = 5;
		int[] A = {3,4,4,6,1,4,4};
		Lesson4MaxCounters less = new Lesson4MaxCounters();
		int[] result = less.solution(N, A);
		
		System.out.println("Final Array of counters: " + less.solution(N, A));

	}
	
	public int[] solution(int N, int[] A) {
		
		int[] B = new int[N];
		
		for (int e:B) {
			B[e] = 0;
		}
		
		return B;
		
	}
	

}
