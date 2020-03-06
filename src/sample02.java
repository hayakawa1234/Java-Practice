/**
 * 
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
		String input_text = scanner.nextLine();
		System.out.println(input_text + "が入力されました");
		
		

	}

}
