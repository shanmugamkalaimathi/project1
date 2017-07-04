import java.util.Scanner;
public class PalindromeLongPro {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word");
		String str=in.next();
		String substr;
		int x=0;
		String s = null;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					substr=str.substring(i,j+1);
					StringBuffer sb=new StringBuffer(substr);
					StringBuffer s2=sb.reverse();
					String ss=new String(s2);
					if(substr.equals(ss))
					{
						int l1=substr.length();
						if(l1>x)
						{
							s=substr;
							x=l1;
						}
					}
					
					
				}
			}
		}
		System.out.println(s);
}
}
