import java.util.Scanner;
public class PrimeNUmberRange {	
			public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
					for(int i=a;i<b;i++){
					int	flag=0;
		            for(int j=2;j<i;j++)
		            {
		            	if(i%j==0){
		            	flag = 1;
		            	break;
		            	}
		            }
		            	if(flag==0){
			            System.out.println(+i);
		            	}

		            }
					}
					
				
			}






