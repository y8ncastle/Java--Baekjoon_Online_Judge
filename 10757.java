import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class Main {
	public static void main(String args[]) {
		String number;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			number = br.readLine();
			
			BigDecimal a = new BigDecimal(number.split(" ")[0]);
			BigDecimal b = new BigDecimal(number.split(" ")[1]);
			
			bw.write(String.valueOf(a.add(b)));
			bw.flush();
		} catch (IOException io) {
			io.getStackTrace();
		}
	}
}
