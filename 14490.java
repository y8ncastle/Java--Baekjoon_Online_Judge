import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) {
		int a, b;
		String num, temp[];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			temp = new String[2];
			num = br.readLine();
			
			temp[0] = num.split(":")[0];
			temp[1] = num.split(":")[1];
			
			a = Integer.parseInt(temp[0]);
			b = Integer.parseInt(temp[1]);
			
			for (int i=a; i>0; i--) {
				if (a % i == 0 && b % i == 0) {
					a /= i;
					b /= i;
					break;
				}
			}
			
			bw.write(String.valueOf(a) + ":" + String.valueOf(b) + '\n');
			bw.flush();
		} catch (IOException io) {
			io.getStackTrace();
		}		
	}
}
