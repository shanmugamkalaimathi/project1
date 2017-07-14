import java.util.Scanner;
public class Prime {
		public static void main(String[] args){
		int number,i,flag=0;
				Scanner sc = new Scanner(System.in);
				number=sc.nextInt();
				int m=number/10;
				for(i=2;i<=number-1;i++){
	            if(number%i==0)
	            {
	            	flag=1;
	            	break;
	            }
				}
				if(flag==1){
					System.out.println("given number is not  prime");
				}
	            else 
	            {
	            	System.out.println("given number is a prime");
	            }
	}
		}



