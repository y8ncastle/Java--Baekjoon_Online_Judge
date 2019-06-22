import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) {
		String a, b, c="", d="";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			a = br.readLine();
			b = br.readLine();
			
			for (int i=0; i<8; i++) {
				c += a.toCharArray()[i];
				c += b.toCharArray()[i];
			}
			
			for (int i=0; i<14; i++) {
				if (i > 0) {
					c = d; d = "";
				}
				
				for (int j=0; j<15-i; j++) {
					int temp = Integer.parseInt(String.valueOf(c.toCharArray()[j])) + Integer.parseInt(String.valueOf(c.toCharArray()[j+1]));
					d += String.valueOf(temp % 10);
				}
			}
			
			bw.write(d);
			bw.close();
		} catch (IOException io) {
			io.getStackTrace();
		}
	}
}
