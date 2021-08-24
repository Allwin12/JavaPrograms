// Reverse string using the StringBuilder package

public class StringBuilderReverse
{
    static String reverseName(String name){
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }
    
	public static void main(String[] args) {
		String name = reverseName("Hello World");
		System.out.println(name);
	}
}
