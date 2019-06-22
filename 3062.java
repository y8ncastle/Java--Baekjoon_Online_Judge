import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Calculate {
	String number;
	
	Calculate() {
		number = "";
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void testCheck() {
		StringBuffer sb = new StringBuffer();
		
		for (int i=number.length()-1; i>=0; i--) {
			sb.append(number.toCharArray()[i]);
		}
		
		int check = 0;
		int temp_sum = Integer.parseInt(sb.toString()) + Integer.parseInt(number);
		String sum = String.valueOf(temp_sum);
		sb.delete(0, number.length()-1);
		
		switch (sum.length()) {
			case 2:
				if (sum.toCharArray()[0] == sum.toCharArray()[1])
					check = 1;
				break;
			case 3 :
				if (sum.toCharArray()[0] == sum.toCharArray()[2])
					check = 1;
				break;
			case 4 :
				if ((sum.toCharArray()[0] == sum.toCharArray()[3]) && (sum.toCharArray()[1] == sum.toCharArray()[2]))
					check = 1;
				break;
			case 5 :
				if ((sum.toCharArray()[0] == sum.toCharArray()[4]) && (sum.toCharArray()[1] == sum.toCharArray()[3]))
					check = 1;
				break;
			case 6 :
				if ((sum.toCharArray()[0] == sum.toCharArray()[5]) && (sum.toCharArray()[1] == sum.toCharArray()[4]) && (sum.toCharArray()[2] == sum.toCharArray()[3]))
					check = 1;
				break;
			case 7 :
				if ((sum.toCharArray()[0] == sum.toCharArray()[6]) && (sum.toCharArray()[1] == sum.toCharArray()[5]) && (sum.toCharArray()[2] == sum.toCharArray()[4]))
					check = 1;
				break;
		}
		
		if (check == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

public class Main {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int test = Integer.parseInt(br.readLine());
			
			for (int i=0; i<test; i++) {
				c.setNumber(br.readLine());
				c.testCheck();
			}
		} catch (IOException io) {
			io.getStackTrace();
		}
	}
}
