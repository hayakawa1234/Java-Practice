/**
 * 練習問題 5 - 2
 * 次のプログラムを作成しなさい。
 * 
 * 10 個の数値を入力する。
 * 入力された順番と逆の順番で 10 個の数値を表示する。
 */

/**
 * @author hayak
 *
 */
public class sample08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] value = { 1, 3, 8, 10, 12, 15, 18, 20, 21, 24 };

		for (int i = value.length - 1; i >= 0; i--) {
			System.out.println(value[i]);

		}

	}

}
