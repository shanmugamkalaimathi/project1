package p1;
import java.util.Scanner;
public class pnz {
	public static void main(String[] args){
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		if(number>0){
			System.out.println("Positive number:"+number);
		}
		else if(number<0){
			System.out.println("negative number:"+number);
		}
		else{
			System.out.println("zero:"+number);
		}
	}

}
