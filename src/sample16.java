/**
 * ���K��� 5 - 2 ���̃v���O�������쐬���Ȃ����B
 * 
 * 10 �̐��l����͂���B ���͂��ꂽ���ԂƋt�̏��Ԃ� 10 �̐��l��\������B
 */

public class sample16 {

	public static void main(String[] args) {

		int[] values = new int[10];
		values[0] = 23;
		values[1] = 32;
		values[2] = 4;
		values[3] = 5;
		values[4] = 7;
		values[5] = 12;
		values[6] = 16;
		values[7] = 11;
		values[8] = 8;
		values[9] = 3;

		for (int i = values.length - 1; i >= 0; i--) {
			System.out.println(values[i]);

		}
	}

}
