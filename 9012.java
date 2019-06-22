import java.util.*;

public class Main {
	public static void main (String[] args) {
		int t, i, j, a, b, c;
		String ps;
		
		Scanner input = new Scanner(System.in);
		t = input.nextInt();
		
		for (i=0; i<t; i++) {
			ps = input.next();
				
			a=0; b=0; c=0;
			
			for (j=0; j<ps.length(); j++) {
				if (ps.length() % 2 == 1) {
					break;
				}
				else if ((a == 0 && b== 0) && (ps.toCharArray()[j] == ')')) {
					break;					
				}
				else {
					if (ps.toCharArray()[j] == '(')
						a++;
					else if (ps.toCharArray()[j] == ')')
						b++;
					
					if ((a > 0) && (b > 0)) {
						a -= 1;
						b -= 1;
						c += 1;
					}
				}
			}
			
			if ((a == 0) && (b == 0) && (c * 2 == ps.length()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
