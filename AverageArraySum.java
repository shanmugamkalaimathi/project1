package lc3;
import java.util.Scanner;
public class AverageArraySum {
public static void main(String[] args){
	int n;
	int [] b=new int[5];
	int count=0;
	int sum=0,average;
	Scanner in = new Scanner(System.in) ;
	n = in.nextInt();
	int[] a=new int [n];
	
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
		
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
if(a[i]==a[j]){
	System.out.println(+a[j]);
}
}
  }
 }
}

