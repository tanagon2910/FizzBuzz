import java.util.Scanner;
public class FizzBuzz {

	public static String printStringinput(int number) {
		String result = Integer.toString(number);
		
		if(number%15 == 0) {
			result ="FizzBuzz";
		}else if(number%3 == 0) {
			result = "Fizz";
		}else if(number%5 == 0){
			result = "Buzz";
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ur number");
		int n = input.nextInt();
		System.out.println(printStringinput(n));
	}
}
