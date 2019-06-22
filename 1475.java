import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		String n;
		int max = -1, num[] = new int[10];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		try {
			n = br.readLine();
			
			for (int i=0; i<n.length(); i++) {
				if (n.toCharArray()[i] != '6' && n.toCharArray()[i] != '9')
					num[n.toCharArray()[i]-48]++;
				else
					num[6]++;
			}
			
			for (int i=0; i<9; i++) {
				if (i != 6 && num[i] > max)
					max = num[i];
			}
			
			if (2*max >= num[6])
				bw.write(String.valueOf(max) + '\n');
			else if (num[6] % 2 == 1)
				bw.write(String.valueOf((num[6]/2)+1));
			else
				bw.write(String.valueOf((num[6]/2)));
			
			bw.flush();
		} catch (IOException io) {
			io.getStackTrace();
		}
	}
}
