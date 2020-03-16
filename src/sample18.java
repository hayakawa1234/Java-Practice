import java.io.*;

/*
 * 次のコードに追加し、入力された数値を 16 桁の２進数で表示するプログラムを完成させなさい。
 * 
 * BufferedReader br = new BufferedReader(
 * 
 * 						 new InputStreamReader( System.in ) );
 * 
 * 							int value = Integer.parseInt( br.readLine() );
 * 
 * 							int binary[] = new int[16];
 * 
 * 							// 配列 binaryに0か1を代入する
 * 
 * for( int i = 0 ; i < 16 ; i++ )
 * System.out.print( binary[i] );
 */

public class sample18 {

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("10進数を入力してください");
			int value = Integer.parseInt(br.readLine());
		}

		catch (IOException e) {
			System.out.println(e);
			return;
		}

		catch (NumberFormatException e) {
			System.out.println("Error: 数字を入力してください!");
			return;
		}

		int binary[] = new int[16];

//配列 binaryに0か1を代入する

		for (int i = 0; i < 16; i++)
				System.out.print(binary[i]);

	}

}
