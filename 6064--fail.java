import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		String num[] = new String[4];
		int t, m, n, x, y;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		try {
			t = Integer.parseInt(br.readLine());
			
			for (int i=0; i<t; i++) {
				num = br.readLine().split(" ");
				
				m = Integer.parseInt(num[0]);
				n = Integer.parseInt(num[1]);
				x = Integer.parseInt(num[2]);
				y = Integer.parseInt(num[3]);
				
				int tx=0, ty=0, k=0;
				
				while (true) {
					if (tx < m) tx++;
					else tx = 1;
					
					if (ty < n) ty++;
					else ty = 1;
					
					k++;
					
					if (tx == x && ty == y)
						break;
					
					if ((tx == 1 && ty == 1) && (k > 1)) {
						k = -1;
						break;
					}
				}
				
				bw.write(String.valueOf(k) + '\n');
				bw.flush();
			}
		} catch (IOException io) {
			io.getStackTrace();
		}
	}
}
