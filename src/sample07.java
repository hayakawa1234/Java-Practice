import java.util.Scanner;

/**
 * 練習問題 5 - 1
 * 次のプログラムを作成しなさい。
 * 
 * 10 個の数値を入力する。
 * 入力された各々の数値を 2 倍にして表示する。
 */

/**
 * @author hayak
 *
 */
public class sample07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] value = { 1, 3, 8, 10, 12, 15, 18, 20, 21, 24 };

		/**
		 * System.out.println(a[0]); System.out.println(a[1]); System.out.println(a[2]);
		 * System.out.println(a[3]); System.out.println(a[4]); System.out.println(a[5]);
		 * System.out.println(a[6]); System.out.println(a[7]); System.out.println(a[8]);
		 * System.out.println(a[9]);
		 */

		for (int i = 0; i < value.length; i++) {

			System.out.println(value[i] * 2);
		}

	}
}
