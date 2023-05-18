package utility;

public class ToggleCase {
	public static String toggle(String str)
	{
		char ch[] = str.toCharArray(); 

		for(int i=0;i<str.length();i++)
		{   
			if(ch[i]>=65 && ch[i]<=90)
				ch[i] = (char)(ch[i] + 32);
			else
				if(ch[i]>=97 && ch[i]<=122)
					ch[i] = (char)(ch[i] - 32);
		}

		String str1 = new String(ch);
		System.out.println(str1);
		return str1;
	}

	public static void main(String[] args) {
		String str = "RaceCar";
		String str1 = toggle(str);
		System.out.println("The Toggle of string '" + str + "' is: " + str1);
	}
}
