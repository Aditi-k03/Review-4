public class SpecialChar
{  
	public static void main(String args[])   
	{  
		String str= "Hello @Ad!iT!I.";   
		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(str);  
	}  
}  