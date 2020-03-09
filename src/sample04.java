import java.util.Scanner;

/**
 * 練習問題 4 - 21
 * サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
 * サイズ 3 の例
 * X X
 *  X
 * X X
 * サイズ 4 の例
 * X  X
 *  XX
 *  XX
 * X  X
 * サイズ 5 の例
 * X   X
 *  X X
 *   X
 *  X X
 * X   X
 */

/**
 * @author hayak
 *
 */
public class sample04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("サイズを入力してください");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int i;
		int j;
		for (i = 0; i < num; i++) {
			System.out.print("y");
			for (j = 0; j < num; j++) {

				System.out.print("x");
			}
			System.out.println("z");

		}
	}
}