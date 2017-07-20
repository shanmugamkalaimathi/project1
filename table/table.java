import java.util.Scanner;
public class Multiplication {
public static void main(String[] args){
	int n,mul;
	Scanner in = new Scanner(System.in); 
n = in.nextInt();
int i;
for(i=1;i<=10;i++){
	mul=i*n;
	System.out.println(i + "*" + n + "=" + mul);
}
}
}
