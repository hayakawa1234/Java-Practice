/**
 *好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
 * ※ 	switch 文を使用する。
 * ※ 	選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
 * ※ 	題材は鮨でなくても良い。

 */

/**
 * @author hayak
 *
 */

import java.util.Scanner;

public class sample02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("鮨占い 好きなネタを選んでね？");
		System.out.println("1: まぐろ 2:　こはだ 3: サーモン 4: ");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("入力してください");
		int num = scanner.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("大吉");
				break;
			case 2:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("小吉");
				break;
			case 4:
				System.out.println("凶");
				break;
				
		}
		
		
		

	}

}
