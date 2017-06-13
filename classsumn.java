package sumOfN;
import java.util.Scanner;
public class classsumn {
	public static void main(String[] args){
					int sum=0,a=1;
					int n;
					Scanner input = new Scanner(System.in);
					System.out.println("the number is:");
					n = input.nextInt();
					while(a<=n){
								
								sum = sum + a;		
								a++;
					}
					System.out.println("the sum :"+sum);
				}
		}

