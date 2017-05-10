/* Even Fibonacci numbers 피보나치 알고리즘 */
package toTheTenth;

public class Problem002 {

	public static void main(String[] args) {
		int sum = 0;
		int a = 0;
		int b = 1;
		int c = a + b;
		while (c < 4000000) {
			if (c % 2 == 0) {
				sum = sum + c;
			}
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(sum);
	}
}