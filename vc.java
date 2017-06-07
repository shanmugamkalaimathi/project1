package p1;
import java.util.Scanner;
public class vc {
         public static void main(String[] args){
			Scanner reader = new Scanner(System.in);
			char c = reader.next().charAt(0);
			switch(c){
			case'a':
				System.out.println("vowel");
				break;
			case'e':
				System.out.println("vowel");
				break;
			case'i':
				System.out.println("vowel");
				break;
			case'o':
				System.out.println("vowel");
				break;
			case'u':
				System.out.println("vowel");
				break;
			default:
			System.out.println(" consonant");
			}
		}
		
}

