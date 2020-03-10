
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

		int[] values = { 1, 3, 8, 10, 12, 15, 18, 20, 21, 24 };

		int evenValues[];
		evenValues = new int[10];
		for(int i=0;i<evenValues.length;i++) {
			evenValues[i] = 0;
		}

		int oddValues[];
		oddValues = new int[10];
		for(int i=0;i<oddValues.length;i++) {
			oddValues[i] = 0;
		}
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0) {
				evenValues[i] =values[i];
			} else {
				oddValues[i] =values[i];
			}
		}
		
		System.out.print("偶数は");
		for(int i=0;i<evenValues.length;i++) {
			if(evenValues[i] > 0) {
				System.out.print(evenValues[i]+", ");		
			}
		}

		System.out.print("奇数は");
		for(int i=0;i<oddValues.length;i++) {
			if(oddValues[i] > 0) {
				System.out.print(oddValues[i]+", ");		
			}
		}

		

		/**for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0) {
				System.out.print("偶数:" + values[i]);
			} else {
				System.out.print("奇数:" + values[i]);
			}

		}*/

	}

}
