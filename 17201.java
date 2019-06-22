import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) {
		int n, check = 0;
		String magnet;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			n = Integer.parseInt(br.readLine());
			magnet = br.readLine();
			
			for (int i=0; i<2*n; i++) {
				if (i != 0 && i != 2*n-1) {
					if (magnet.toCharArray()[i-1] == magnet.toCharArray()[i] || magnet.toCharArray()[i] == magnet.toCharArray()[i+1]) {
						check = 1;
						break;
					}
				} else if (i == 0) {
					if (magnet.toCharArray()[i] == magnet.toCharArray()[i+1]) {
						check = 1;
						break;
					}
				} else if (i == 2*n -1) {
					if (magnet.toCharArray()[i] == magnet.toCharArray()[i-1]) {
						check = 1;
						break;
					}
				}
			}
			
			if (check == 0) bw.write("Yes");
			else bw.write("No");
			
			bw.close();
		} catch(IOException io) {
			io.getStackTrace();
		}
	}
}
