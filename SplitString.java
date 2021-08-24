public class SplitString
{
	public static void main(String[] args) {
		String str = "All that glitters is not gold!";
		String words[] = str.split(" ");
		
		for (String word: words)
	    System.out.println(word);

	}
}
