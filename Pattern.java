	import java.util.Scanner;
public class Pattern {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int i,j,x,m;
		for(i=0;i<n;i++){
			for(j=0;j<n-i;j++){
				System.out.print("*");
			}
			for(x=0;x<=0;x++){
				System.out.print(" ");
			}for(m=0;m<n-i;m++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		}

}
