/**
 * ���K��� 5 - 3
 * ���̃v���O�������쐬���Ȃ����B
 * 
 * 10 �̐��l����͂���B
 * ���͂��ꂽ���l�������Ɗ�ɕ��ނ��ĕ\������B
 * �\����F
 * �����F42 54 32 8
 * ��F7 35 71 13 21 45
 */

/**
 * @author hayak
 *
 */
public class sample09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] value = { 1, 3, 8, 10, 12, 15, 18, 20, 21, 24 };
		
		for (int i = 0; i < value.length; i++) {
			if (value[i] % 2 == 0) {
				System.out.print("����:" + value[i]);
			} else {
				System.out.print("�:" + value[i]);
			}

		}

	}

}
