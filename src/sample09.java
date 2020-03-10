/**
 * 練習問題 5 - 3
 * 次のプログラムを作成しなさい。
 * 
 * 10 個の数値を入力する。
 * 入力された数値を偶数と奇数に分類して表示する。
 * 表示例：
 * 偶数：42 54 32 8
 * 奇数：7 35 71 13 21 45
 */

/**
 * @author hayak
 *
 */
public class sample09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] value = { 1, 3, 8, 10, 12, 15, 18, 20, 21, 24 };
		
		for (int i = 0; i < value.length; i++) {
			if (value[i] % 2 == 0) {
				System.out.print("偶数:" + value[i]);
			} else {
				System.out.print("奇数:" + value[i]);
			}

		}

	}

}
