package p1;
import java.util.Scanner;
public class lyr {
			public static void main(String[] args){
				int number;
				Scanner sc = new Scanner(System.in);
				number = sc.nextInt();
				if(number%4==0){
					System.out.println("leap year:"+number);
				}
				else {
					System.out.println("not leap year:"+number);
				}
				
			}
}
