import java.util.Scanner;
public class BeginnerSet2 {
		public static void main(String[] args){
			int number;
			Scanner in = new Scanner(System.in);
			number = in.nextInt();
			int temp = number;
			int sum = 0;
			while(temp!=0){
				int r= number%10;
				temp = temp/10;
				sum = (sum*10)+r;
			}
			if(number==sum){
				System.out.println("palindrome");
			}
			else{
				System.out.println("not palindrome");

			}
		}

	}



