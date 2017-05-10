/* Largest prime factor 소인수 알고리즘 */
package toTheTenth;

public class Problem003 {

	public static void main(String[] args) {
		int n = 13195;
		int divisor = 0;
		int res = 0;

		
		for (int i = 1; i < n; i++) {
			
			if (n % i == 0 ) { //약수
				//소수 구하는 공식
				
				System.out.println(i);
			}
		}
	}

}
