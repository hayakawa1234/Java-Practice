/*
 * 練習問題 5 - 4
 * 数値を繰り返して入力し、合計が 100 を超えた場合、または入力が 10 回行われた場合、
 * 入力を止め入力された数値をすべて表示するプログラムを作成しなさい。
 */
public class sample17 {

	public static void main(String[] args) {

		int[] values = new int[13];
		values[0] = 2;
		values[1] = 4;
		values[2] = 4;
		values[3] = 5;
		values[4] = 7;
		values[5] = 12;
		values[6] = 16;
		values[7] = 11;
		values[8] = 8;
		values[9] = 3;
		values[10] = 22;
		values[11] = 3;
		values[12] = 5;
		

		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
			System.out.println(values[i]);
			if (sum >= 100) {
				System.exit(values[i]);
			} else if (i >= 10) {
				System.exit(values[i]);

			}
		}
	}

}
