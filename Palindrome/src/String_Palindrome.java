import java.util.Scanner;
public class String_Palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name :");
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);

		if(s1.equals(s2)) System.out.println("Given string is palindrome");
		else System.out.println("Given String is not palindrome");

	}

}
