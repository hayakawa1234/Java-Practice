
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

		int[] values = { 1, 3, 8, 10, 12, 15, 18, 20, 21, 24 };

		int evenValues[];
		evenValues = new int[10];
		for(int i=0;i<evenValues.length;i++) {
			evenValues[i] = 0;
		}

		int oddValues[];
		oddValues = new int[10];
		for(int i=0;i<oddValues.length;i++) {
			oddValues[i] = 0;
		}
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0) {
				evenValues[i] =values[i];
			} else {
				oddValues[i] =values[i];
			}
		}
		
		System.out.print("������");
		for(int i=0;i<evenValues.length;i++) {
			if(evenValues[i] > 0) {
				System.out.print(evenValues[i]+", ");		
			}
		}

		System.out.print("���");
		for(int i=0;i<oddValues.length;i++) {
			if(oddValues[i] > 0) {
				System.out.print(oddValues[i]+", ");		
			}
		}

		

		/**for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0) {
				System.out.print("����:" + values[i]);
			} else {
				System.out.print("�:" + values[i]);
			}

		}*/

	}

}
