
public class Aa {
	public static void main(String a[]){
		String str = "Bj??rk????oacute?";
		System.out.println(str);
		str = str.replaceAll("[^\\p{ASCII}]", "");
		System.out.println("After removing non ASCII chars:");
		System.out.println(str);
}
}
