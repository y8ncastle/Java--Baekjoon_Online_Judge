import java.util.*;

class Remove {
	String word;
	
	Remove() {
		word = "";
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public void wordCheck() {
		for (int i=0; i<word.length(); i++) {
			if ((word.toCharArray()[i] >= 'A' && word.toCharArray()[i] <= 'E') || (word.toCharArray()[i] == 'G') || (word.toCharArray()[i] == 'I') || (word.toCharArray()[i] == 'M') || (word.toCharArray()[i] == 'R'))
				;
			else
				System.out.print(word.toCharArray()[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Remove r = new Remove();
		
		Scanner s = new Scanner(System.in);
		r.setWord(s.next());
		r.wordCheck();
	}
}
