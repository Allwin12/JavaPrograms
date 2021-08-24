// Reverse string manually

public class StringReverse
{
    static String reverseName(String name){
        String reversedName = "";
        for(int i=name.length()-1; i>=0; i--)
        {
            reversedName += name.charAt(i);
        }
        return reversedName;
    }
    
	public static void main(String[] args) {
		String name = reverseName("Hello World");
		System.out.println(name);
	}
}
