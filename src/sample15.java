/**
 * ���K��� 5 - 1 ���̃v���O�������쐬���Ȃ����B
 * 
 * 10 �̐��l����͂���B ���͂��ꂽ�e�X�̐��l�� 2 �{�ɂ��ĕ\������B
 */
public class sample15 {

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

		int[] mult = new int[10];
		for (int i = 0; i < values.length; i++) {
			mult[i] = values[i] * 2;
			System.out.println(mult[i]);
		}

		for (int i = 0; i < values.length; i++) {
			values[i] = values[i] * 2;
		}

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
}
