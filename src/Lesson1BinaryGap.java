import java.util.Random;

public class Lesson1BinaryGap {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int val = rand.nextInt(2147483647) + 1;	
		Lesson1BinaryGap sol = new Lesson1BinaryGap();
		sol.solution(val);
	}
	
	
    public int solution(int N) {
		
    	int result = 0;
    	String binaryString = Integer.toBinaryString(N);
    	
    	int lenght = binaryString.length();
    	//System.out.println("lenght of binary number " + binaryString + " is " + lenght);
    	
    	int zerosNumber = 0;
    	
    	for(int i = 1; i<lenght; i++) {
    		
			//System.out.println("binaryString.charAt(i)= " + binaryString.charAt(i));
			
    		if(binaryString.charAt(i) == '0'){
    			
    			zerosNumber = zerosNumber+1;
    			
    		}
    		
    		if(i+1<lenght) {
    			if( (binaryString.charAt(i+1) == '1')){
    		   			
     				   				
     				if(zerosNumber>result) {
     					result = zerosNumber;
     				}
     				
    				zerosNumber = 0;
    		}
    	
    		//System.out.println(i + " iteration. zerosNumber is " + zerosNumber + " and result is " + result);
    		
    		}
    		
    	}
    	
		System.out.println("binary gap for given " + N + " with binary representation " + binaryString + " is " + result);
    	return result;
    
    

    }

}