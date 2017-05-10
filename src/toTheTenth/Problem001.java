/* Multiples 3 and 5 배수 알고리즘 */
package toTheTenth;

public class Problem001 {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
