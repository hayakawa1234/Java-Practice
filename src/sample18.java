import java.io.*;

/*
 * ���̃R�[�h�ɒǉ����A���͂��ꂽ���l�� 16 ���̂Q�i���ŕ\������v���O���������������Ȃ����B
 * 
 * BufferedReader br = new BufferedReader(
 * 
 * 						 new InputStreamReader( System.in ) );
 * 
 * 							int value = Integer.parseInt( br.readLine() );
 * 
 * 							int binary[] = new int[16];
 * 
 * 							// �z�� binary��0��1��������
 * 
 * for( int i = 0 ; i < 16 ; i++ )
 * System.out.print( binary[i] );
 */

public class sample18 {

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("10�i������͂��Ă�������");
			int value = Integer.parseInt(br.readLine());
		}

		catch (IOException e) {
			System.out.println(e);
			return;
		}

		catch (NumberFormatException e) {
			System.out.println("Error: ��������͂��Ă�������!");
			return;
		}

		int binary[] = new int[16];

//�z�� binary��0��1��������

		for (int i = 0; i < 16; i++)
				System.out.print(binary[i]);

	}

}
