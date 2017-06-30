import java.util.Scanner;

public class PrintArrayElement {
	public static void main(String[] args){
		int n;
		int flag=1;
		int [] b=new int[5];
		int count=0;
		int sum=0,average;
		Scanner in = new Scanner(System.in) ;
		n = in.nextInt();
		int[] a=new int [n];
		
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			
		}
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    if(a[i] != a[j])
                    {
                        flag = 1;
                    }
                    else
                   {
                       flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
            {
                count++;
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
      
    }

}