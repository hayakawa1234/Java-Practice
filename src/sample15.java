/**
 * ���K��� 5 - 1
 * ���̃v���O�������쐬���Ȃ����B
 * 
 * 10 �̐��l����͂���B
 * ���͂��ꂽ�e�X�̐��l�� 2 �{�ɂ��ĕ\������B
 */
public class sample15 {

	public static void main(String[] args) {
		//int[] value = {23 * 2, 32 * 2, 33 * 2, 12 * 2, 54 * 2, 22 * 2, 10 * 2, 11 * 2, 45 * 2, 17 * 2};
		
		int[] values = new int[10 * 2];
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
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i] * 2);
		}

	}

}
