import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int count, i, lower, upper, num, space;
		String words = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while ((words = br.readLine()) != null) {
			lower=0; upper=0; num=0; space=0;
			count = words.length();
			
			for (i=0; i<count; i++) {
				if (words.toCharArray()[i] == ' ')
					space++;
				else if (words.toCharArray()[i] >= 48 && words.toCharArray()[i] <= 57)
					num++;
				else if (words.toCharArray()[i] >= 65 && words.toCharArray()[i] <= 90)
					upper++;
				else if (words.toCharArray()[i] >= 97 && words.toCharArray()[i] <= 122)
					lower++;
			}
			
			System.out.println(lower + " " + upper + " " + num + " " + space + " ");
		}
	}
}
