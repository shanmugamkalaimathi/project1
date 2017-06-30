import java.util.Scanner;
public class FirstIndexNumber { 
	public static void main(String[] args){
    Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int i;
	int count=0;
	int[] array=new int[size];
	for( i=0;i<size;i++){
		array[i] = in.nextInt();	
        }
      
    for( i=0;i<size;i++){
    	if(i==0){
    	for(int j=1;j<size;j++){
    	if(array[i]==array[j]){
    		System.out.println("Repeated array First Elements");
    		count++;
    	}
    	
   	}
	}
}
	}
}