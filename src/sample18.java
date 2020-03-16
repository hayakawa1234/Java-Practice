import java.io.*;

/*
 * 〇練習問題 5 - 5
 * 次のコードに追加し、入力された数値を 16 桁の２進数で表示するプログラムを完成させなさい。
 * 
 * BufferedReader br = new BufferedReader(
 * 
 * 		new InputStreamReader( System.in ) );
 * 
 * 		int value = Integer.parseInt( br.readLine() );
 * 
 * 		int binary[] = new int[16];
 * 
 * 		// 配列 binaryに0か1を代入する
 * 
 * 			for( int i = 0 ; i < 16 ; i++ )
 *			 System.out.print( binary[i] );
 */

public class sample18 {

	public static void main(String[] args) {

		int value=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("10進数を入力してください");
			value = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println(e);
			return;
		} catch (NumberFormatException e) {
			System.out.println("Error: 数字を入力してください!");
			return;
		}

		// 150 -> 0x0000000010010110
		int binary[] = new int[16];
		for (int i = 16-1; i >=0; i--) {
			int pow = 1;
			for(int j=0;j<i;j++) {
				pow *= 2;
			}
			binary[i] = 0;
			if(value>=pow) {
				binary[i] = 1;				
				value -= pow;
			}
		}

		for (int i = 15; i >=0; i--) {
			System.out.print(binary[i]);
		}
	}
}
