/*problem002/ Even Fibonacci numbers*/
package basic;

public class Problem002 {

	public static void main(String[] args) {	//BigInteger 
		int a1 = 1;
		int a2 = 1;
		int a3;
		int sum = 0;

		for (int i = 1; i <= 15; i++) {
			a3 = a1 + a2;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
			if (a3 % 2 == 0) {
				sum += a3;
			}

		}
		System.out.println(sum);
		//값 초과
	}
}