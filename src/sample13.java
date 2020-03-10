/**
 *練習問題 6 - 4
 *サイズを示す数値（int）を引数とし、何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
 *
 *また、このメソッドを使用してサイズ 3、4、5 の３つの三角形を表示するプログラムを作成しなさい。
 *
 *例：
 *$
 *$$
 *$$$
 *
 *$
 *$$
 *$$$
 *$$$$
 *
 *$
 *$$
 *$$$
 *$$$$
 *$$$$$ 
 */

/**
 * @author hayak
 *
 */
public class sample13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int j;

		for (i = 0; i < 3; i++) {
			System.out.print("y");
			for (j = 0; j < 3; j++) {

				System.out.print("$");

			}
			System.out.println("z");

		}
	}
}
