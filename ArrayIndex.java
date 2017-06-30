import java.util.Scanner;

public class ArrayIndex {
	 public static void main(String[] args){
			int size,flag =0,i=0;
			Scanner in = new Scanner(System.in);
			size = in.nextInt();
			int[] array=new int[size];
			for(i=0;i<size;i++){
				array[i] = in.nextInt();	
		        }
		        int given = in.nextInt();
		       for( i=0;i<size;i++){
		    	   int a = array[i];
		       if(a==given){
		    	   flag =1;
		    	   break;
		       }
		       else{
		    	   flag =0 ;
		       }
		       }
		       if(flag==1){
		       System.out.println("index values of array:"+( i ));
		}
		       else{
		System.out.println("-1");
		      
		       }
}
}