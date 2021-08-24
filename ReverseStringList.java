import java.util.*;

public class ReverseStringList
{
	public static void main(String[] args) {
		String str = "All that glitters is not gold!";
		String[] words = str.split(" ");
		
		List<String> list = Arrays.asList(str.split(" "));
		Collections.reverse(list);
		System.out.println(list);
	}
}
