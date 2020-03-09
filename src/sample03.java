import java.util.Scanner;

/**
 * 月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
 * また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。
 * ※ 	switch 文を使用すること。

 */

/**
 * @author hayak
 *
 */
public class sample03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("好きな月を入力してください");
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("31日");
			break;
		case 2:
			System.out.println("28日");
			break;
		case 3:
			System.out.println("31日");
			break;
		case 4:
			System.out.println("30日");
			break;
		case 5:
			System.out.println("31日");
			break;
		case 6:
			System.out.println("30日");
			break;
		case 7:
			System.out.println("31日");
			break;
		case 8:
			System.out.println("31日");
			break;
		case 9:
			System.out.println("30日");
			break;
		case 10:
			System.out.println("31日");
			break;
		case 11:
			System.out.println("30日");
			break;
		case 12:
			System.out.println("31日");
			break;
			
		default:
			System.out.println("入力が間違っています");
			
		}
		

	}

}
