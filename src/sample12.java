/**
 *練習問題 6 - 3
 *２つの整数の大きい方を選ぶメソッドを作成しなさい。２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
 *
 *また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、最も大きい数値を表示するプログラムを作成しなさい。 
 */

/**
 * @author hayak
 *
 */
public class sample12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value, value2;
		int big;

		value = 80;
		value2 = 100;
		
		big = max(value, value2);

		System.out.print(big);

	}
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}

}
