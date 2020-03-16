/**
 * 練習問題 5 - 2 次のプログラムを作成しなさい。
 * 
 * 10 個の数値を入力する。 入力された順番と逆の順番で 10 個の数値を表示する。
 */

public class sample16 {

	public static void main(String[] args) {

		int[] values = new int[10];
		values[0] = 23;
		values[1] = 32;
		values[2] = 4;
		values[3] = 5;
		values[4] = 7;
		values[5] = 12;
		values[6] = 16;
		values[7] = 11;
		values[8] = 8;
		values[9] = 3;

		for (int i = values.length - 1; i >= 0; i--) {
			System.out.println(values[i]);

		}
	}

}
