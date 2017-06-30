import java.util.Scanner;
public class ReverseDigits {
		public static void main(String[] args){
			int number;
			int sum=0;
			Scanner sc = new Scanner(System.in);
			number=sc.nextInt();
			while(number!=0){
				int r = number%10;
				number=number/10;
				sum = (sum*10) + r;
			}
				System.out.println(+sum);
				
			}

	}

