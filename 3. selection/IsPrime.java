import java.util.Scanner;

public class IsPrime {
  public static void main(String[] args) {
    int number, numOfDiv = 0;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter positive a number");
	number = in.nextInt();
	
	if(number <=0){
		System.out.println("Error: Enter a positive number!");
		return;
		
	} else {
		
		for(int count = 1; count <= number; count++){
			
			if((number % count == 0)){
			numOfDiv+=1;
			}
		}
		
		if(numOfDiv == 2){
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}	
}  
}