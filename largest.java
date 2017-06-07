package p1;
import java.util.Scanner;
public class largest {
	public static void main(String[] args){
		int f,s,t;
		Scanner in = new Scanner(System.in);
		f = in.nextInt();
		s = in.nextInt();
		t = in.nextInt();
		if(f>s && f>t){
			System.out.println("f is greater:"+f);
		}
		else if(s>f && s>t){
			System.out.println("s is greater:"+s);
	}
		else{
				System.out.println("t is greater:"+t);
		}

}
}
