import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		String a, b, result = "";
		char symbol;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			a = br.readLine();
			symbol = br.readLine().toCharArray()[0];
			b = br.readLine();
			
			BigDecimal bda = new BigDecimal(a.toString());
			BigDecimal bdb = new BigDecimal(b.toString());
		
			if (symbol == '+')
				result = bda.add(bdb).toString();
			else if (symbol == '*')
				result = bda.multiply(bdb).toString();
		
			System.out.println(result);
		} catch (IOException io) {
			io.getStackTrace();
		}		
	}
}
