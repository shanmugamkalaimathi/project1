package p1;
import java.util.Scanner;
public class eo {
		public static void main(String[] args){
			int number;
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
			if(number%2==0){
				System.out.println("Even number:"+number);
			}
			else {
				System.out.println("Odd number:"+number);
			}
			
			
		}

	}

