/**
 *FizzBuzz
 *– 2人以上のプレイヤーが1から順番に数字を発言していく
 *– 3で割り切れるときは「Fizz」を発言
 *– 5で割り切れるときは「Buzz」を発言
 *– 両方で割り切れるときは「FizzBuzz」を発言
 *– 間違えた人から脱落

 
 */

/**
 * @author hayak
 *
 */
public class sample06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int i;
		// for (i = 0; i <= 20; i++) {
		// System.out.println(i);
		// if (i % 3 == 0) {
		// System.out.println("Fizz");
		// } else if (i % 5 == 0) {
		// System.out.println("Buzz");

		// } else if ((i % 3 == 0) && (i % 5 == 0)) {
		// System.out.println("FizzBuzz");
		// }
		int i;
		for (i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}
	}

}
