
public class Lesson3Frog {
	
	public static void main(String args[]) {
		
		Lesson3Frog obj = new Lesson3Frog();
		int X = 0;
		int Y = 90;
		int D = 10;
		System.out.println("X= " + X + " Y= " + Y + " D= " + D + " jumps: " + obj.solution(X, Y, D));
		
	}
	
	public int solution(int X, int Y, int D) {
		
		int res = (Y-X)%D;
		if(res == 0) {		
			return (Y-X)/D;		
		}else {
			return (Y-X)/D+1-res/D;
		}
		
	}

}
