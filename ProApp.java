	import java.util.Scanner;
public class ProApp {
	public static void main(String[] args, int i) {
	String sc="hello";
	for( i=0;i<=sc.length();i++)
	{
	    char e=sc.charAt(i);
	    if((e== 'A')||(e=='E')||(e=='I')||(e=='O')||(e=='U')){
	        {
	String h=sc.substring(0, i);

	String g=sc.substring(i+ i);
	sc=h+"Z"+g;
	}}
	}
	System.out.println("The result is="+sc);
}
}