package Array;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class App8 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String exp="\\d+";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(input);
		while(m.find())
		{
			System.out.println(m.group());
		}
		
	}
 
}
