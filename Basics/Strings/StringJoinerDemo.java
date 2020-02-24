import java.util.*;

public class StringJoinerDemo {
	public static void main(String args[]) {
		String []wordList = {"Bull","Pipes","Apple","Jam","Ink","Place"};
		StringJoiner sj = new StringJoiner(" ");
		String sentence = "";
		for(String w:wordList) sj.add(w);
		sentence = sj.toString();
		
			System.out.println(sentence);
	}
}
