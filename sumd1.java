package p1;
import java.util.Scanner;
public class sumd1 {
public static void main(String[] args){
				int n,i,b,a=0;
				Scanner input = new Scanner(System.in);
				System.out.println("the number is:");
				n = input.nextInt();
				while(n!=0){
							
								b=n%10;
								a=a+b;
								n=n/10;				
				}
				System.out.println("the sum of  digits are:"+a);
			}
	}







