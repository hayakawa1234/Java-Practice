/**
 *練習問題 6 - 2
 *２つの整数の平均を計算するメソッドを作成しなさい。２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
 *
 *また、メソッドの動作を検証できるようにプログラムを作成しなさい。
 *
 *※ 	平均の計算は整数で行い、小数点以下は切り捨ててよい。
 
 */

/**
 * @author hayak
 *
 */
public class sample11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value, value2;
		double av;

		value = 40;
		value2 = 50;
		
		av = avarage(value, value2);

		System.out.print(av);
	}

	public static double avarage(int a, int b) {
		return ((a + b) / 2.0);
	}
}
