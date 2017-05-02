/*problem003/ Largest prime factor*/
package basic;

public class Problem003 {

	public static void main(String[] args) {
		int n = 13195;
		int res = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0 ) { //약수
				
				System.out.println(i);
			}
		}
	}

}
