/**
 *���K��� 6 - 3
 *�Q�̐����̑傫������I�ԃ��\�b�h���쐬���Ȃ����B�Q�� int �^���������A�傫�����̐��l��߂�l�Ƃ��ĕԂ����ƁB
 *
 *�܂��A���̃��\�b�h���g�p���āAint �^�̕ϐ� x�Ay�Az �ɂ��ꂼ�ꐔ�l����͂��A�ł��傫�����l��\������v���O�������쐬���Ȃ����B 
 */

/**
 * @author hayak
 *
 */
public class sample12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value, value2;
		int big;

		value = 80;
		value2 = 100;
		
		big = max(value, value2);

		System.out.print(big);

	}
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}

}
